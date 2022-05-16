package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A078473 Expansion of zeta function of icosian ring.
 * @author Sean A. Irvine
 */
public class A078473 implements Sequence {

  // After Michel Marcus

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      switch ((int) p.mod(5)) {
        case 0:
          // i.e., p == 5
          res = res.multiply(p.pow(e + 1).subtract(1).divide(4));
          break;
        case 1:
        case 4:
          Z s = Z.ZERO;
          Z q = Z.ONE;
          for (int k = 0; k <= e; ++k, q = q.multiply(p)) {
            s = s.add(q.multiply(e - k + 1).multiply(k + 1));
          }
          res = res.multiply(s);
          break;
        case 2:
        case 3:
        default:
          if ((e & 1) == 1) {
            return Z.ZERO;
          } else {
            res = res.multiply(p.pow(e + 2).subtract(1).divide(p.square().subtract(1)));
          }
          break;
        }
      }
    return res;
  }
}
