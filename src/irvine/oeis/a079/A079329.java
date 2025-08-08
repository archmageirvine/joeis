package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a006.A006512;

/**
 * A079329 Let g(n)=A006512(n) be the larger member of the n-th pair of twin primes. Then a(n) is the average of g(n) and g(n+1).
 * @author Sean A. Irvine
 */
public class A079329 extends A006512 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mA).divide2();
  }
}
