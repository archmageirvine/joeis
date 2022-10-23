package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A046231 Numbers whose cube is palindromic in base 4.
 * @author Sean A. Irvine
 */
public class A046231 extends Sequence1 {

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
