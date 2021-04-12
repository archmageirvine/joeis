package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;
import irvine.util.string.StringUtils;

/**
 * A046448 Squarefree nonprimes with property that the concatenation of the prime factors is a palindrome.
 * @author Sean A. Irvine
 */
public class A046448 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final StringBuilder sb = new StringBuilder();
      final FactorSequence fs = Cheetah.factor(t);
      if (fs.isSquareFree()) {
        for (final Z p : fs.toZArray()) {
          sb.append(p);
        }
        if (StringUtils.isPalindrome(sb)) {
          return t;
        }
      }
    }
  }
}
