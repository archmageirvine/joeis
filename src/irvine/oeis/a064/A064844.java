package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064844 Number of iterations of x -&gt; x + A064834(x) to reach a palindrome, starting with n (or -1 if no palindrome is ever reached).
 * @author Sean A. Irvine
 */
public class A064844 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = 0;
    long m = ++mN;
    while (!LongUtils.isPalindrome(m, 10)) {
      m += A064834.count(m);
      ++k;
    }
    return Z.valueOf(k);
  }
}
