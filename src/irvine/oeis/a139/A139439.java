package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A139439 Numbers n such that primorial(n)/2 + 4 is prime.
 * @author Georg Fischer
 */
public class A139439 extends A002110 {

  private int mK;
  private int mParm;

  /** Construct the sequence. */
  public A139439() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param parm the constant
   */
  public A139439(final int parm) {
    mK = 0;
    mParm = parm;
    super.next(); // skip primorial(1)
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z prime = super.next().divide2().add(mParm);
      if (prime.isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
