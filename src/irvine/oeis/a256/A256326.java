package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A256326 Numbers k such that 3*R_(k+2) - 2*10^k is prime, where R_k = 11...1 is the repunit (A002275) of length k.
 * @author Georg Fischer
 */
public class A256326 extends Sequence1 {

  private int mK; // current number to be returned
  private int mFR; // the factor before <code>R_(k+2)</code>
  private int mF10; // the factor before <code>10^k</code>
  private Z mRk2; // R_(k+2)
  private Z mP10; // 10^k

  /** Construct the sequence. */
  public A256326() {
    this(3, -2);
  }

  /**
   * Generic constructor with parameters
   * @param fR the factor before <code>R_(k+2)</code>
   * @param f10 the factor before <code>10^k</code>
   */
  public A256326(final int fR, final int f10) {
    mK = -1;
    mFR = fR;
    mF10 = f10;
    mRk2 = Z.valueOf(11);
    mP10 = Z.ONE;
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z t = mRk2.multiply(mFR).add(mP10.multiply(mF10));
      mRk2 = mRk2.multiply(10).add(1);
      mP10 = mP10.multiply(10);
      if (t.isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
