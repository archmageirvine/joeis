package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;
import irvine.util.string.StringUtils;

/**
 * A085924 If k = product (p_i)^(r_i), where p_i are primes in increasing order, then k is a member if concatenation of r_i as decimal numbers forms a palindrome.
 * @author Sean A. Irvine
 */
public class A085924 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085924() {
    super(1, k -> {
      final FactorSequence fs = Jaguar.factor(k);
      final StringBuilder sb = new StringBuilder();
      for (final Z p : fs.toZArray()) {
        sb.append(fs.getExponent(p));
      }
      return StringUtils.isPalindrome(sb);
    });
  }
}
