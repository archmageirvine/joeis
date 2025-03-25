package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A076160 Sod_4 - sod_3 + sod_2 - sod_1, where sod_k is the sum of k-th powers of digits of n.
 * @author Sean A. Irvine
 */
public class A076160 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSumPower(++mN, 10, 4)
      - ZUtils.digitSumPower(mN, 10, 3)
      + ZUtils.digitSumPower(mN, 10, 2)
      - Functions.DIGIT_SUM.l(mN));
  }
}
