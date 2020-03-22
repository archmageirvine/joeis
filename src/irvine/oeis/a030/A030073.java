package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A030073 Numbers n such that <code>n^2</code> is palindromic in base 15.
 * @author Sean A. Irvine
 */
public class A030073 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(15))) {
        return mN;
      }
    }
  }
}
