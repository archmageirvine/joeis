package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084687 Nontrivial numbers k containing no zero digits which are divisible by the number formed by writing the digits of k in ascending order.
 * @author Sean A. Irvine
 */
public class A084687 extends Sequence1 {

  private long mN = 9512;

  private boolean is(final long n) {
    if ((Functions.SYNDROME.i(n) & 1) == 1) {
      return false; // contains a zero
    }
    final long asc = Functions.DIGIT_SORT_ASCENDING.l(n);
    if (n == asc) {
      return false;
    }
    return n % asc == 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
