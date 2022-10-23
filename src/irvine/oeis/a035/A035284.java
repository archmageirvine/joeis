package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035284 Similar submodules of icosian ring of index f(n)^2 where f(n) is the n-th positive integer represented by the quadratic form x^2 + xy - y^2.
 * @author Sean A. Irvine
 */
public class A035284 extends Sequence1 {

  // After Michel Marcus

  private long mN = 0;

  static Z g(final Z p, final int e) {
    final Z pe = p.pow(e);
    final Z pe1 = pe.multiply(p);
    return pe.multiply(e + 1).add(pe1.multiply(e).subtract(pe.multiply(e + 1)).add(1).multiply2().divide(p.subtract(1).square()));
  }

  private Z f(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      switch ((int) p.mod(5)) {
        case 0:
          // i.e., p == 5
          res = res.multiply(g(p, e));
          break;
        case 1:
        case 4:
          Z s = Z.ZERO;
          Z q = Z.ONE;
          for (int k = 0; k <= e; ++k, q = q.multiply(p)) {
            s = s.add(g(p, k).multiply(g(p, e - k)));
          }
          res = res.multiply(s);
          break;
        case 2:
        case 3:
        default:
          if ((e & 1) == 1) {
            return Z.ZERO;
          } else {
            res = res.multiply(g(p.square(), e / 2));
          }
          break;
      }
    }
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      final Z res = f(++mN);
      if (!res.isZero()) {
        return res;
      }
    }
  }
}
