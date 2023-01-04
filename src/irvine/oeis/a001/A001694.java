package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001694 Powerful numbers, definition (1): if a prime p divides n then p^2 must also divide n (also called squareful, square full, square-full or 2-powerful numbers).
 * @author Sean A. Irvine
 */
public class A001694 extends Sequence1 {

  private long mN = 0;

  /**
   * Test if the given number is powerful.
   * @param n number to test
   * @return true iff powerful
   */
  public static boolean isPowerful(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z f : fs.toZArray()) {
      if (fs.getExponent(f) == 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (true) {
      final Z n = Z.valueOf(mN);
      if (isPowerful(n)) {
        return n;
      }
      ++mN;
    }
  }
}
