package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A033665.
 * @author Sean A. Irvine
 */
public class A033665 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    String n = m.toString();
    while (!StringUtils.isPalindrome(n)) {
      m = m.add(new Z(new StringBuilder(n).reverse().toString()));
      n = m.toString();
      ++c;
    }
    return Z.valueOf(c);
  }
}
