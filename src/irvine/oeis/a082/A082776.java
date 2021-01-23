package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A082776 a(1) = 1, a(n) = smallest palindromic multiple of a(n-1) obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A082776 implements Sequence {

  private Z mA = null;

  protected Z first() {
    return Z.ONE;
  }

  private boolean subsequence(final String s, final String q) {
    assert s.length() >= q.length();
    for (int k = 0, j = 0; k < s.length(); ++k) {
      if (s.charAt(k) == q.charAt(j) && ++j == q.length()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = first();
    } else {
      Z n = mA;
      final String q = mA.toString();
      while (true) {
        n = n.add(mA);
        final String s = n.toString();
        if (StringUtils.isPalindrome(s) && subsequence(s, q)) {
          mA = n;
          break;
        }
      }
    }
    return mA;
  }
}

