package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080662.
 * @author Sean A. Irvine
 */
public class A080695 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      sb.append(p.pow(fs.getExponent(p)));
    }
    return new Z(sb);
  }
}
