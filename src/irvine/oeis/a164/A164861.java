package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A164861 Odd positive integers that are not palindromes when written in binary.
 * @author Georg Fischer
 */
public class A164861 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    while (StringUtils.isPalindrome(Long.toBinaryString(mN))) {
      mN += 2;
    }
    return Z.valueOf(mN);
  }
}
