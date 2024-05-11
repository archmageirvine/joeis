package irvine.math.predicate;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.util.CollectionUtils;
import irvine.util.string.StringUtils;

/**
 * Test if a number is a palindrome.
 * @author Sean A. Irvine
 */
class Palindrome extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    if (base <= 36) {
      return StringUtils.isPalindrome(n.toString((int) base));
    }
    final Z b = Z.valueOf(base);
    final ArrayList<Long> digits = new ArrayList<>();
    Z t = n;
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(b);
      digits.add(qr[1].longValue());
      t = qr[0];
    }
    return CollectionUtils.isPalindrome(digits);
  }
}
