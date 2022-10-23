package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A138576 Numbers k such that 2^(2*k - 1) - 1 is prime.
 * @author Georg Fischer
 */
public class A138576 extends Sequence1 {

  private int mN;
  private final int mParm;

  /** Construct the sequence. */
  public A138576() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param parm parameter in the exponent
   */
  public A138576(final int parm) {
    mN = 0;
    mParm = parm;
    // whether to take the absolute value
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (2 * mN >= mParm) {
        final Z term = Z.ONE.shiftLeft(2 * mN - mParm).subtract(mParm).abs();
        if (term.isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
