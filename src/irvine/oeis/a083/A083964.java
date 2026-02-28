package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.PrefixedPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083964 Smallest palindromic multiple of 2n-1 beginning with the digit string of 2n-1; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083964 extends Sequence1 {

  protected long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final int c = Functions.DIGIT_LENGTH.i(mN);
    final long rev = Functions.REVERSE.l(mN);
    if (rev % Functions.GCD.l(Z.FIVE.pow(c), mN) != 0) {
      return Z.ZERO;
    }
    final PrefixedPalindromes palins = new PrefixedPalindromes(mN);
    while (true) {
      final Z p = palins.next();
      if (p.mod(mN) == 0) {
        return p;
      }
    }
  }
}
