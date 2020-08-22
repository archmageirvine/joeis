package irvine.oeis.a035;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035185 Number of divisors of n == 1 or 7 (mod 8) minus number of divisors of n == 3 or 5 (mod 8).
 * @author Sean A. Irvine
 */
public class A035185 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (!Z.TWO.equals(p)) {
        final int e = fs.getExponent(p);
        final long m = p.mod(8);
        if (m > 1 && m < 7) {
          if ((e & 1) != 0) {
            return Z.ZERO;
          }
        } else {
          prod = prod.multiply(e + 1);
        }
      }
    }
    return prod;
  }
}
