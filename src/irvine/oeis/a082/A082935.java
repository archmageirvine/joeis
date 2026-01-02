package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.PrefixedPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082935 Smallest palindrome beginning with n and a digit sum of n at some stage.
 * @author Sean A. Irvine
 */
public class A082935 extends Sequence1 {

  private int mN = 0;

  private boolean is(final Z p, final int n) {
    int s = Functions.DIGIT_SUM.i(p);
    while (s > n) {
      s = Functions.DIGIT_SUM.i(s);
    }
    return s == n;
  }

  @Override
  public Z next() {
    if (++mN == 19) {
      // Known difficult case
      return new Z("1949999999999999999999491");
    }
    final PrefixedPalindromes it = new PrefixedPalindromes(mN);
    while (true) {
      final Z p = it.next();
      if (is(p, mN)) {
        return p;
      }
    }
  }
}
