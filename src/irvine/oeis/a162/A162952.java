package irvine.oeis.a162;

import irvine.factor.factor.Cheetah;
import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162952 A positive integer n is included if n and the number of divisors of n contain the same number of 1's in their binary representations.
 * @author Sean A. Irvine
 */
public class A162952 implements Sequence {

  private long mN = 0;
  protected long mD;

  @Override
  public Z next() {
    while (true) {
      mD = Cheetah.factor(++mN).sigma0();
      if (PopCount.popcount(mD) == PopCount.popcount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
