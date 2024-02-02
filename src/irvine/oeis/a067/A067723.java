package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A067723 Nontrivial palindromes k such that phi(k) is also a palindrome.
 * @author Sean A. Irvine
 */
public class A067723 extends Sequence1 {

  private final Sequence mA = new A002113().skip(10);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (ZUtils.isPalindrome(Euler.phi(t), 10)) {
        return t;
      }
    }
  }
}
