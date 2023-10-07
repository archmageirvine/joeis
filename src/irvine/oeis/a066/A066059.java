package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.oeis.base.RaddSequence;

/**
 * A066059 Integers such that the 'Reverse and Add!' algorithm in base 2 (cf. A062128) does not lead to a palindrome.
 * @author Sean A. Irvine
 */
public class A066059 extends Sequence1 implements Conjectural {

  private static final int HEURISITC_STEPS = 1000;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final RaddSequence s = new RaddSequence(1, 2, ++mN);
      long k = 0;
      while (true) {
        final Z m = s.next();
        if (ZUtils.isPalindrome(m, 2)) {
          break;
        }
        if (++k >= HEURISITC_STEPS) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
