package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072414 extends Sequence1 {

  private long mN = 359;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z lcm = Z.ONE;
      for (final Z p : fs.toZArray()) {
        lcm = lcm.lcm(fs.getExponent(p));
      }
      if (!lcm.equals(Z.valueOf(fs.maxExponent())) && (fs.omega() == 1 || fs.minExponent() == 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
