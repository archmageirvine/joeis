package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;
import irvine.util.string.StringUtils;

/**
 * A046447 Apart from initial term, composite numbers with property that concatenation of prime factors is a palindrome.
 * @author Sean A. Irvine
 */
public class A046447 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final StringBuilder sb = new StringBuilder();
      final FactorSequence fs = Jaguar.factor(t);
      for (final Z p : fs.toZArray()) {
        final String sp = p.toString();
        for (int j = 0; j < fs.getExponent(p); ++j) {
          sb.append(sp);
        }
      }
      if (StringUtils.isPalindrome(sb)) {
        return t;
      }
    }
  }
}
