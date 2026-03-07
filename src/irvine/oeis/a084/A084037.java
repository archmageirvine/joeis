package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084037 Primes obtained as the sum of two successive terms of A084035.
 * @author Sean A. Irvine
 */
public class A084037 extends A084035 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}

