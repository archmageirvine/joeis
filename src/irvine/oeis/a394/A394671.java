package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394671 Power tower of ascending prime factors of n with multiplicity.
 * @author Sean A. Irvine
 */
public class A394671 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z tower = Z.ONE;
    final Z[] ps = fs.toZArray();
    for (int k = ps.length - 1; k >= 0; --k) {
      final int e = fs.getExponent(ps[k]);
      for (int j = 0; j < e; ++j) {
        tower = ps[k].pow(tower);
      }
    }
    return tower;
  }
}
