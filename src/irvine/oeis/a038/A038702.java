package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038702 Prime(n)^2 mod prime(n-1).
 * @author Sean A. Irvine
 */
public class A038702 extends A000040 {

  private Z mA = super.next();
  protected int mExpon;

  /** Construct the sequence. */
  public A038702() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param expon exponent
   */
  public A038702(final int expon) {
    setOffset(2);
    mExpon = expon;
  }

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.pow(mExpon).mod(t);
  }
}
