package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086532 Primes arising in A086531. a(n)= {A086531(n) + A086531(n+1)}/2.
 * @author Sean A. Irvine
 */
public class A086532 extends A086531 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t).divide2();
  }
}

