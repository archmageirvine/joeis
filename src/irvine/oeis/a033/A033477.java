package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033477 Products <code>p^3</code> or <code>p^2*q</code>, where <code>{p,q}</code> are consecutive primes.
 * @author Sean A. Irvine
 */
public class A033477 extends A000040 {

  private Z mP = super.next();
  private Z mA = mP.pow(3);
  private Z mB = null;

  @Override
  public Z next() {
    if (mB != null) {
      final Z t = mB;
      mB = null;
      return t;
    }
    if (mA != null) {
      final Z t = mA;
      mA = null;
      return t;
    }
    final Z t = mP;
    mP = super.next();
    mA = mP.pow(3);
    mB = mP.square().multiply(t);
    return t.square().multiply(mP);
  }
}

