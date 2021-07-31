package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A032789 Numbers k such that (k*(k+1)*(k+2)) / (k+(k+1)+(k+2)) is a palindrome.
 * @author Sean A. Irvine
 */
public class A032789 implements Sequence {

  private long mN = -1;

  protected long t() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z a = Z.ONE;
      for (long k = 0; k <= t(); ++k) {
        a = a.multiply(mN + k);
      }
      final Z[] qr = a.divideAndRemainder(Z.valueOf((t() + 1) * mN + t() * (t() + 1) / 2));
      if (qr[1].isZero() && StringUtils.isPalindrome(qr[0].toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}

