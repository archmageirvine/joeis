package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086518 Primes arising as the arithmetic mean of a pair of successive terms of A086517.
 * @author Sean A. Irvine
 */
public class A086518 extends A086517 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t).divide2();
  }
}

