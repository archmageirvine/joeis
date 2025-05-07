package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A383349 Numbers that have the same set of digits as the sum of 4th powers of its digits.
 * @author Sean A. Irvine
 */
public class A383349 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SYNDROME.i(++mN) == Functions.SYNDROME.i(ZUtils.digitSumPower(mN, 10, 4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
