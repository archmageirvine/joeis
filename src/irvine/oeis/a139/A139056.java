package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A139056 Numbers k for which (k!-3)/3 is prime.
 * @author Georg Fischer
 */
public class A139056 extends A000142 {

  private int mK;
  private final int mParm;
  private final Z mAbsParm;

  /** Construct the sequence. */
  public A139056() {
    this(-3);
  }

  /**
   * Generic constructor with parameters
   * @param parm the constant
   */
  public A139056(final int parm) {
    setOffset(1);
    mK = -1;
    mParm = parm;
    mAbsParm = Z.valueOf(parm < 0 ? -parm : parm);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z[] quot = super.next().add(mParm).divideAndRemainder(mAbsParm);
      if (quot[1].isZero() && quot[0].isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
