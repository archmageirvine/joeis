package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086522 Primes arising as the arithmetic mean of a pair of successive terms of A086519.
 * @author Sean A. Irvine
 */
public class A086522 extends A086519 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t).divide2();
  }
}

