package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A076082.
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
