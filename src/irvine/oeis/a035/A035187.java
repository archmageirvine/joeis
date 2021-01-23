package irvine.oeis.a035;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035187 Sum over divisors d of n of Kronecker symbol (5|d).
 * @author Sean A. Irvine
 */
public class A035187 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      switch ((int) p.mod(5)) {
        case 0:
          break;
        case 1:
        case 4:
          res = res.multiply(fs.getExponent(p) + 1);
          break;
        case 2:
        case 3:
        default:
          if ((fs.getExponent(p) & 1) == 1) {
            return Z.ZERO;
          }
          break;
        }
      }
    return res;
  }
}
