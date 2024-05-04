package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052219;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069524 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 3 == 0 || mN % 11 == 0 || mN % 37 == 0 || mN % 101 == 0 || mN % 137 == 0 || mN % 239 == 0) {
      return Z.ZERO;
    }
    final Sequence a = new A052219();
    while (true) {
      final Z t = a.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}
