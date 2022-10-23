package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A139057 Primes of the form (k!-3)/3.
 * @author Georg Fischer
 */
public class A139057 extends A000142 {

  private final int mParm;
  private final Z mAbsParm;

  /** Construct the sequence. */
  public A139057() {
    this(-3);
  }

  /**
   * Generic constructor with parameters
   * @param parm the constant
   */
  public A139057(final int parm) {
    setOffset(1);
    mParm = parm;
    mAbsParm = Z.valueOf(parm < 0 ? -parm : parm);
  }

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = super.next().add(mParm).divideAndRemainder(mAbsParm);
      if (quot[1].isZero() && quot[0].isProbablePrime()) {
        return quot[0];
      }
    }
  }
}
