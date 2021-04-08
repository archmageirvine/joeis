package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A046232 Cubes which are palindromes in base 4.
 * @author Sean A. Irvine
 */
public class A046232 implements Sequence {

  private long mN = -1;

  protected int base() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(3);
      if (StringUtils.isPalindrome(t.toString(base()))) {
        return t;
      }
    }
  }
}
