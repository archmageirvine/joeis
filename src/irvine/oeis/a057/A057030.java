package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057030 Let P(n) of a sequence s(1),s(2),s(3),... be obtained by leaving s(1),...,s(n-1) fixed and reversing every n consecutive terms thereafter; apply P(2) to 1,2,3,... to get PS(2), then apply P(3) to PS(2) to get PS(3), then apply P(4) to PS(3), etc. The limit of PS(n) is A057030.
 * @author Sean A. Irvine
 */
public class A057030 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN);
    for (long k = 1; k < mN; ++k) {
      a = a.add(mN - k).subtract(a.mod(mN - k) * 2);
    }
    return a;
  }
}
