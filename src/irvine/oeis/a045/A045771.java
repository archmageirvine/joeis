package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045771 Number of similar sublattices of index n^2 in root lattice D_4.
 * @author Sean A. Irvine
 */
public class A045771 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (!Z.TWO.equals(p)) {
        final int e = fs.getExponent(p);
        final Z pe = p.pow(e);
        final Z t = pe.multiply(p.multiply(e).subtract(e + 1)).add(1).multiply2().divide(p.subtract(1).square());
        prod = prod.multiply(pe.multiply(e + 1).add(t));
      }
    }
    return prod;
  }
}

