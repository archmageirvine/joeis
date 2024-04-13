package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A030547 Number of terms (including the initial term) needed to reach a palindrome when the Reverse Then Add! map (x -&gt; x + (x-with-digits-reversed)) is repeatedly applied to n, or -1 if a palindrome is never reached.
 * @author Sean A. Irvine
 */
public class A030547 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 1;
    Z m = mN;
    while (!StringUtils.isPalindrome(m.toString())) {
      m = m.add(Functions.REVERSE.z(m));
      ++c;
    }
    return Z.valueOf(c);
  }
}
