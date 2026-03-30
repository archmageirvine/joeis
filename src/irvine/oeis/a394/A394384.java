package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394384 Power tower of descending prime factors of n with multiplicity.
 * @author Sean A. Irvine
 */
public class A394384 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z tower = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      for (int k = 0; k < e; ++k) {
        tower = p.pow(tower);
      }
    }
    return tower;
  }
}
