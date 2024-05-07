package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a166.A166311;

/**
 * A069530 Smallest multiple of n with digit sum = 11, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069530 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 3 == 0 || mN % 1111 == 0 || mN % 1507 == 0 || mN % 2849 == 0 || mN % 3367 == 0 || mN % 4849 == 0 || mN % 5291 == 0 || mN % 7373 == 0) {
      return Z.ZERO;
    }
    final Sequence a = new A166311();
    while (true) {
      final Z t = a.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}
