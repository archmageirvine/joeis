package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A162844.
 * @author Sean A. Irvine
 */
public class A162844 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (!StringUtils.isPalindrome(Long.toBinaryString(++mN))) {
      // do nothing
    }
    final Z v = Z.valueOf(mN);
    Z q = v;
    int c = 1;
    do {
      q = q.add(v);
      ++c;
    } while (!StringUtils.isPalindrome(q.toString(2)));
    return Z.valueOf(c);
  }
}
