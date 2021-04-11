package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046450 Concatenation of prime factors of palindromic composite is a palindrome.
 * @author Sean A. Irvine
 */
public class A046450 extends A046447 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        final StringBuilder sb = new StringBuilder();
        final FactorSequence fs = Cheetah.factor(t);
        for (final Z p : fs.toZArray()) {
          sb.append(p.toString());
        }
        if (StringUtils.isPalindrome(sb)) {
          return t;
        }
      }
    }
  }
}
