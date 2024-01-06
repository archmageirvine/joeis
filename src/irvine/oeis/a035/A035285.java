package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035285 Similar submodules in cubian ring of index f(n)^2 where f(n) is the n-th positive integer represented by the quadratic form x^2 - 2 y^2.
 * @author Sean A. Irvine
 */
public class A035285 extends Sequence1 {

  // After Michel Marcus

  private long mN = 0;

  private Z f(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      switch ((int) p.mod(8)) {
        case 2:
          // i.e., p == 2
          res = res.multiply(A035284.g(p, e));
          break;
        case 1:
        case 7:
          Z s = Z.ZERO;
          Z q = Z.ONE;
          for (int k = 0; k <= e; ++k, q = q.multiply(p)) {
            s = s.add(A035284.g(p, k).multiply(A035284.g(p, e - k)));
          }
          res = res.multiply(s);
          break;
        case 3:
        case 5:
        default:
          if ((e & 1) == 1) {
            return Z.ZERO;
          } else {
            res = res.multiply(A035284.g(p.square(), e / 2));
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
