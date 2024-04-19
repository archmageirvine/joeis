package irvine.oeis.a260;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A260558 Numbers n such that (n^29+1)/(n+1) is prime.
 * @author Georg Fischer
 */
public class A260558 extends Sequence1 {

  private long mN;
  private final int mPow;

  /** Construct the sequence. */
  public A260558() {
    this(29);
  }

  /**
   * Generic constructor with parameters.
   * @param pow
   */
  public A260558(final int pow) {
    mN = 0;
    mPow = pow;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z n = Z.valueOf(mN);
      final Z t = n.pow(mPow).add(1).divide(mN + 1);
      if (t.isProbablePrime()) {
        return n;
      }
    }
  }
}
