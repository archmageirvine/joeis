package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A079328 Let f(n)=A001359(n) be the smaller member of the n-th pair of twin primes. Then a(n) is the average of f(n) and f(n+1).
 * @author Sean A. Irvine
 */
public class A079328 extends A001359 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mA).divide2();
  }
}
