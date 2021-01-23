package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036333 Composite numbers n such that juxtaposition of prime factors of n has length 9.
 * @author Sean A. Irvine
 */
public class A036333 implements Sequence {

  // In theory this could be done with A036328.build(9), but that would use a
  // lot of memory as it would generate the entire sequence up front.
  // So instead we test each number here, and detect when we reach the end.

  private long mGenerated = 0;
  private long mN = 511;

  @Override
  public Z next() {
    if (++mGenerated > 84018465) {
      return null;
    }
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.omega() > 1 || fs.maxExponent() > 1) {
        int len = 0;
        for (final Z p : fs.toZArray()) {
          len += p.toString().length() * fs.getExponent(p);
        }
        if (len == 9) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
