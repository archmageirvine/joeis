package irvine.oeis.a063;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063831.
 * @author Sean A. Irvine
 */
public class A063831 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Cheetah.factor(mN);
      Z s = Z.ZERO;
      for (final Z d : fs.divisors()) {
        s = s.add(d.pow(3));
      }
      if (Z.ZERO.equals(s.sqrtAndRemainder()[1])) {
        return Z.valueOf(mN);
      }
    }
  }
}

