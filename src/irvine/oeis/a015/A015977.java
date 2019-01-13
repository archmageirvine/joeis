package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A015977.
 * @author Sean A. Irvine
 */
public class A015977 implements Sequence {

  private long mN = 0;

  protected int iterations() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      Z a = Z.valueOf(++mN);
      for (int k = iterations(); k > 0; --k) {
        a = ZUtils.reverse(a).add(a);
        if (StringUtils.isPalindrome(a.toString())) {
          if (k == 1) {
            return Z.valueOf(mN);
          }
          continue outer;
        }
      }
    }
  }
}
