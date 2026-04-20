package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394629 Number of pairs of primes (p, q) such that n! = q^2 - p^2.
 * @author Sean A. Irvine
 */
public class A394629 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ZERO;
    }
    final Z f = Functions.FACTORIAL.z(mN);
    final Z g = Functions.PRIMORIAL.z(mN).makeOdd();
    long cnt = 0;
    for (final Z d : Jaguar.factor(g).divisors()) {
      final Z u = Functions.GCD.z(d.pow(mN), f).multiply2();
      final Z fu = f.divide(u);
      if (fu.subtract(u).abs().divide2().isProbablePrime() && fu.add(u).divide2().isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
