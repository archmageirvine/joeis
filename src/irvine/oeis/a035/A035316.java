package irvine.oeis.a035;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035316 Sum of the square divisors of n.
 * @author Sean A. Irvine
 */
public class A035316 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if ((e & 1) == 0) {
        prod = prod.multiply(p.pow(e + 2).subtract(1).divide(p.square().subtract(1)));
      } else if (e > 1) {
        prod = prod.multiply(p.pow(e + 1).subtract(1).divide(p.square().subtract(1)));
      }
    }
    return prod;
  }
}

