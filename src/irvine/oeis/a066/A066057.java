package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;
import irvine.oeis.base.RaddSequence;

/**
 * A066057 'Reverse and Add' carried out in base 2 (cf. A062128); number of steps needed to reach a palindrome, or -1 if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A066057 extends Sequence0 implements Conjectural {

  private static final int HEURISITC_STEPS = 1000;
  private long mN = -1;

  @Override
  public Z next() {
    final RaddSequence s = new RaddSequence(1, 2, ++mN);
    long k = 0;
    while (true) {
      final Z m = s.next();
      if (ZUtils.isPalindrome(m, 2)) {
        return Z.valueOf(k);
      }
      if (++k >= HEURISITC_STEPS) {
        return Z.NEG_ONE;
      }
    }
  }
}
