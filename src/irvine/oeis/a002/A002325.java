package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;

/**
 * A002325 Glaisher's J numbers.
 * @author Sean A. Irvine
 */
public class A002325 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (!Z.TWO.equals(p)) {
        final long r = p.mod(8);
        final int e = fs.getExponent(p);
        if (r == 1 || r == 3) {
          prod = prod.multiply(e + 1);
        } else {
          assert r == 5 || r == 7;
          if ((e & 1) != 0) {
            return Z.ZERO;
          }
        }
      }
    }
    return prod;
  }
}
