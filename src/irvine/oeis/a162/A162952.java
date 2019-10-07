package irvine.oeis.a162;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162952 A positive integer n is included if n and the number of divisors of n contain the same number of <code>1</code>'s in their binary representations.
 * @author Sean A. Irvine
 */
public class A162952 implements Sequence {

  private long mN = 0;
  protected Z mD;

  @Override
  public Z next() {
    while (true) {
      mD = Cheetah.factor(++mN).sigma0();
      if (mD.bitCount() == (long) Long.bitCount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
