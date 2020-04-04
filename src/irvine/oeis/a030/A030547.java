package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A030547 Number of terms (including the initial term) needed to reach a palindrome when the Reverse Then <code>Add!</code> map <code>(x -&gt; x + (x-with-digits-reversed))</code> is repeatedly applied to n, or -1 if a palindrome is never reached.
 * @author Sean A. Irvine
 */
public class A030547 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 1;
    Z m = mN;
    while (!StringUtils.isPalindrome(m.toString())) {
      m = m.add(ZUtils.reverse(m));
      ++c;
    }
    return Z.valueOf(c);
  }
}
