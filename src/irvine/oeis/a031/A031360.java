package irvine.oeis.a031;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031360 Number of symmetrically inequivalent coincidence rotations of index <code>2n-1</code> in lattice <code>D_4</code>.
 * @author Sean A. Irvine
 */
public class A031360 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z pe1 = p.pow(e - 1);
      prod = prod.multiply(pe1.multiply(p.add(1)).multiply(p.pow(e + 1).add(pe1).subtract(2)).divide(p.subtract(1)));
    }
    return prod;
  }
}
