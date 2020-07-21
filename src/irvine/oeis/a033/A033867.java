package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A033867 Palindrome reached from <code>A033866(n)</code> by <code>Reverse-then-add</code>.
 * @author Sean A. Irvine
 */
public class A033867 extends A033866 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = super.next();
    for (int k = 0; k < mN; ++k) {
      s = s.add(ZUtils.reverse(s));
    }
    return s;
  }
}
