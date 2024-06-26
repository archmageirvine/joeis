package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003052 Self numbers or Colombian numbers (numbers that are not of the form m + sum of digits of m for any m).
 * @author Sean A. Irvine
 */
public class A003052 extends Sequence1 {

  private long mN = 0;

  /**
   * Test if a number is Columbian or self-prime.
   * @param n number to test
   * @return true iff number is self-prime
   */
  public static boolean isColumbian(final long n) {
    boolean ok = true;
    for (int k = 0; k <= n; ++k) {
      if (k + Functions.DIGIT_SUM.l(k) == n) {
        ok = false;
        break;
      }
    }
    return ok;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (isColumbian(mN)) {
        return Z.valueOf(mN);
      }
    }
  }

}
