package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A046231 Numbers n such that n^3 is palindromic in base 4.
 * @author Sean A. Irvine
 */
public class A046231 implements Sequence {

  private long mN = -1;

  protected int base() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Z.valueOf(++mN).pow(3).toString(base()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
