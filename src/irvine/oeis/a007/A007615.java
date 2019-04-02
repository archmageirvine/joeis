package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;

/**
 * A007615 Primes with unique period length (the periods are given in A007498).
 * @author Sean A. Irvine
 */
public class A007615 extends A007498 {

  @Override
  public Z next() {
    final Z[] f = Jaguar.factor(Cyclotomic.cyclotomic(super.next().intValueExact(), 10)).toZArray();
    return f[f.length - 1];
  }
}
