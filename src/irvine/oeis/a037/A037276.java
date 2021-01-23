package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037276 Start with 1; for n&gt;1, replace n with the concatenation of its prime factors in increasing order.
 * @author Sean A. Irvine
 */
public class A037276 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Cheetah.factor(mN);
    for (final Z p : fs.toZArray()) {
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.append(p);
      }
    }
    return new Z(sb);
  }
}

