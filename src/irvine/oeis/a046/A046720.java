package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A046720 Subsequence of beastly primes (A186086) that are palindromes that begin and end with 7.
 * @author Sean A. Irvine
 */
public class A046720 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String zeros = StringUtils.rep('0', ++mN);
      final Z a = new Z('7' + zeros + "666" + zeros + '7');
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
