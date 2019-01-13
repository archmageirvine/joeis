package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A162843.
 * @author Sean A. Irvine
 */
public class A162843 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (!StringUtils.isPalindrome(Long.toBinaryString(++mN))) {
      // do nothing
    }
    final Z v = Z.valueOf(mN);
    Z q = v;
    do {
      q = q.add(v);
    } while (!StringUtils.isPalindrome(q.toString(2)));
    return q;
  }
}
