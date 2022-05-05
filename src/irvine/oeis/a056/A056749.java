package irvine.oeis.a056;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006995;
import irvine.util.CollectionUtils;

/**
 * A056749 Smallest palindrome greater than n in bases 2 and n.
 * @author Sean A. Irvine
 */
public class A056749 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Sequence binaryPalindromes = new A006995();
    while (true) {
      final Z palin = binaryPalindromes.next();
      if (palin.compareTo(n) > 0) {
        final ArrayList<Long> digits = new ArrayList<>();
        Z t = palin;
        while (!t.isZero()) {
          final Z[] qr = t.divideAndRemainder(n);
          digits.add(qr[1].longValue());
          t = qr[0];
        }
        if (CollectionUtils.isPalindrome(digits)) {
          return palin;
        }
      }
    }
  }
}
