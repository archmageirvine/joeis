package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A014840 Sum of all the digits of n in every base prime to n from 2 to n-1.
 * @author Sean A. Irvine
 */
public class A014840 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; ++base) {
      if (Functions.GCD.l(mN, base) == 1) {
        sum += Functions.DIGIT_SUM.l(base, mN);
      }
    }
    return Z.valueOf(sum);
  }
}
