package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052224;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069529 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 3 == 0 || mN % 1111 == 0 || mN % 2849 == 0 || mN % 3367 == 0 || mN % 4649 == 0 || mN % 5291 == 0) {
      return Z.ZERO;
    }
    final Sequence a = new A052224();
    while (true) {
      final Z t = a.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}
