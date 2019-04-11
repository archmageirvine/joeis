package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000016 <code>a(n) =</code> number of distinct (infinite) output sequences from binary n-stage shift register which feeds back the complement of the last stage. E.g., for <code>n=6</code> there are 6 such sequences.
 * @author Sean A. Irvine
 */
public class A000016 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    final FactorSequence fs = Cheetah.factor(n);
    Z sum = Z.ZERO;
    for (final Z d : fs.divisors()) {
      final int i = d.intValue();
      if ((i & 1) == 1) {
        sum = sum.add(Z.valueOf(LongUtils.phi(i)).shiftLeft(mN / i));
      }
    }
    return sum.divide(2L * mN);
  }
}

