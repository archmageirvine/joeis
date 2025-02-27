package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a074.A074311;

/**
 * A075551 Primes generated in A074311.
 * @author Sean A. Irvine
 */
public class A075551 extends A074311 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.add(mA).add(t).divide(3);
  }
}

