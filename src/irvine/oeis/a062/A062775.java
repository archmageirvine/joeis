package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062775 Number of Pythagorean triples mod n: total number of solutions to x^2 + y^2 = z^2 mod n.
 * @author Sean A. Irvine
 */
public class A062775 extends Sequence1 {

  // After R. J. Mathar

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        if ((e & 1) == 1) {
          prod = prod.multiply(Z.ONE.shiftLeft((e + 1) / 2).subtract(1)).shiftLeft((3 * e + 1) / 2);
        } else {
          prod = prod.multiply(Z.ONE.shiftLeft(e / 2 + 1).subtract(1)).shiftLeft(3 * e / 2);
        }
      } else if ((e & 1) == 1) {
        prod = prod.multiply(p.pow((3L * e - 1) / 2)).multiply(p.pow((e + 1L) / 2).add(p.pow((e - 1L) / 2).subtract(1)));
      } else {
        prod = prod.multiply(p.pow(3L * e / 2 - 1)).multiply(p.pow(e / 2 + 1).add(p.pow(e / 2).subtract(1)));
      }
    }
    return prod;
  }
}
