package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039782 phi(n) is equal to the sum of the prime-power components of n-1.
 * @author Sean A. Irvine
 */
public class A039782 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(mN);
      final Z phi = Cheetah.factor(++mN).phi();
      Z sum = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.pow(fs.getExponent(p)));
      }
      if (sum.equals(phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}
