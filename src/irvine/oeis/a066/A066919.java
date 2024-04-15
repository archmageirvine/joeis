package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066919 a(n) = least number of applications of f to n to reach 1, where f is defined by f(n) = phi(n) if n is even; = sigma(n) if n is odd.
 * @author Sean A. Irvine
 */
public class A066919 extends Sequence1 {

  private Z mN = Z.ZERO;

  private Z f(final Z n) {
    return n.isEven() ? Euler.phi(n) : Functions.SIGMA.z(n);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    Z t = mN;
    while (!Z.ONE.equals(t)) {
      t = f(t);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
