package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034699 Largest prime power factor of n.
 * @author Sean A. Irvine
 */
public class A034699 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z max = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      max = max.max(p.pow(fs.getExponent(p)));
    }
    return max;
  }
}
