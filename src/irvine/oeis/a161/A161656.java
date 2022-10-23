package irvine.oeis.a161;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A161656 The largest multiple of {the sum of the distinct prime divisors of n} that is &lt;=n.
 * @author Sean A. Irvine
 */
public class A161656 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN)) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(p);
    }
    final Z s = sum;
    Z oldSum = sum;
    while (sum.compareTo(mN) <= 0) {
      oldSum = sum;
      sum = sum.add(s);
    }
    assert oldSum.compareTo(mN) <= 0;
    return oldSum;
  }
}

