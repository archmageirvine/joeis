package irvine.oeis.a062;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002113;

/**
 * A062686.
 * @author Sean A. Irvine
 */
public class A062697 extends A002113 {

  private static final Z Z22 = Z.valueOf(22);
  private final ArrayList<Z> mPalindromes = new ArrayList<>();
  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TEN.compareTo(p) < 0) {
        if (p.mod(10) != 1 && !Z22.equals(p)) {
          // Observation of Robert Israel
          mPalindromes.add(p);
          return p;
        }
        for (final Z q : mPalindromes) {
          if (q.multiply2().compareTo(p) >= 0) {
            break;
          }
          final Z r = p.subtract(q);
          if (ZUtils.isPalindrome(r, 10)) {
            mPalindromes.add(p);
            return p;
          }
        }
      }
      mPalindromes.add(p);
    }
  }
}
