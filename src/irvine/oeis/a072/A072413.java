package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072413 extends Sequence1 {

  private long mN = 35;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z lcm = Z.ONE;
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        lcm = lcm.lcm(fs.getExponent(p));
        prod = prod.multiply(fs.getExponent(p));
      }
      if (!lcm.equals(prod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
