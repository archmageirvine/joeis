package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080737 a(1) = a(2) = 0; for n &gt; 2, the least dimension of a lattice possessing a symmetry of order n.
 * @author Sean A. Irvine
 */
public class A080737 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        if (e > 1) {
          sum = sum.add(Functions.PHI.z(Z.ONE.shiftLeft(e)));
        }
      } else {
        sum = sum.add(Functions.PHI.z(p.pow(e)));
      }
    }
    return sum;
  }
}
