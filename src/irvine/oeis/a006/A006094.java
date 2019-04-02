package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A006094 Products of 2 successive primes.
 * @author Sean A. Irvine
 */
public class A006094 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.multiply(t);
  }
}

