package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033476 Squares of primes or products of pairs of consecutive primes.
 * @author Sean A. Irvine
 */
public class A033476 extends A000040 {

  {
    setOffset(0);
  }

  private Z mP = super.next();
  private Z mA = mP.square();

  @Override
  public Z next() {
    if (mA != null) {
      final Z t = mA;
      mA = null;
      return t;
    }
    final Z t = mP;
    mP = super.next();
    mA = mP.square();
    return t.multiply(mP);
  }
}

