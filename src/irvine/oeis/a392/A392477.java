package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A392477 A modified Sisyphus function: a(n) = concatenation of (number of odd digits in n) (number of even digits in n) (number of digits in n).
 * @author Sean A. Irvine
 */
public class A392477 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    return new Z(String.valueOf(cnts[1] + cnts[3] + cnts[5] + cnts[7] + cnts[9])
      + (cnts[0] + cnts[2] + cnts[4] + cnts[6] + cnts[8])
      + Functions.SUM.l(cnts));
  }
}
