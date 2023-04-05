package irvine.oeis.a062;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002113;

/**
 * A062686.
 * @author Sean A. Irvine
 */
public class A062696 extends A002113 {

  {
    super.next(); // skip 0
  }
  private final ArrayList<Z> mPalindromes = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(10) == 1) { // All solutions must start and end with 1
        final int len = p.toString().length();
        for (final Z q : mPalindromes) {
          if (q.toString().length() == len) {
            break;
          }
          final Z r = p.subtract(q);
          if (ZUtils.isPalindrome(r, 10) && r.toString().length() < len) {
            mPalindromes.add(p);
            return p;
          }
        }
      }
      mPalindromes.add(p);
    }
  }
}
