package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384543 Number of distinct values from the bitwise operation i XOR j for all integers i and j in the range [1, n].
 * @author Sean A. Irvine
 */
public class A384543 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.TWO;
    }
    return Z.ONE.shiftLeft(Functions.DIGIT_LENGTH.l(2, mN)).subtract((mN & (mN - 1)) == 0 ? 1 : 0);
  }
}
