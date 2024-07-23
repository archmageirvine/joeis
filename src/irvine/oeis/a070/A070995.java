package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070995 Number of nonisomorphic (undirected) Cayley graphs for the group Zp x Zp, where Zp is the elementary Abelian group of order p and p is prime. The sequence is index by primes, though starts with 1.
 * @author Sean A. Irvine
 */
public class A070995 extends A000040 {

  private int h(final int d) {
    return (d & 1) == 0 ? d / 2 : d;
  }

  // Definition 2.5
  private int lcmStar(final int d, final int e) {
    int di = 1;
    int ei = 1;
    while ((d & di) == 0) {
      di <<= 1;
    }
    while ((e & ei) == 0) {
      ei <<= 1;
    }
    if (di == ei && di > 1) {
      return Functions.LCM.i(d, e) / 2;
    } else {
      return Functions.LCM.i(d, e);
    }
  }

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    if (p == 2) {
      return Z.ONE;
    }
    // Theorem 4.2 Alspach
    final CycleIndex ci = new CycleIndex("Omega(" + p + ")");
    final long p2 = (long) p * p;
    final long p12 = (long) (p - 1) * (p - 1);
    final Q c1 = new Q(1, (p2 - 1) * (p2 - p));
    final Q c2 = new Q(1, p2 - p);
    final Q c3 = new Q(1, 2L * p12);
    final Q c4 = new Q(1, p12);
    final Z[] div = Jaguar.factor(p - 1).divisors();
    for (final Z dd : div) {
      final int d = dd.intValue();
      final int hd = h(d);
      final long hd2 = 2L * hd;
      final long phi = Functions.PHI.l(d);
      ci.add(MultivariateMonomial.create(hd, (p2 - 1) / hd2, c1.multiply(phi)));
      final MultivariateMonomial m2 = MultivariateMonomial.create(hd, (p - 1) / hd2, c2.multiply(phi));
      m2.add(p * hd, (p - 1) / hd2);
      ci.add(m2);
      ci.add(MultivariateMonomial.create(hd, (p2 - 1) / hd2, c3.multiply(phi).multiply(phi - 1)));
      for (final Z ee : div) {
        if (ee.compareTo(dd) > 0) {
          final int e = ee.intValue();
          final long phiE = Functions.PHI.l(e);
          final int lcmStar = lcmStar(d, e);
          final MultivariateMonomial m4 = MultivariateMonomial.create(hd, (p - 1) / hd2, c4.multiply(phi * phiE));
          m4.add(h(e), (p - 1) / (2L * h(e)));
          m4.add(lcmStar, p12 / (2L * lcmStar));
          ci.add(m4);
        }
      }
    }
    final Q c5 = new Q(1, 2 * (p2 - 1));
    for (final Z dd : Jaguar.factor(p2 - 1).divisors()) {
      final int d = dd.intValue();
      if (d != 1 && p % d != 1) {
        ci.add(MultivariateMonomial.create(h(d), (p2 - 1) / (2L * h(d)), c5.multiply(Functions.PHI.l(d))));
      }
    }
    return ci.eval(2).toZ();
  }
}
