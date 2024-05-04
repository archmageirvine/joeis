package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052220;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069525 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 9 == 0 || mN % 237 == 0 || mN % 271 == 0 || mN % 803 == 0) {
      return Z.ZERO;
    }
    final Sequence a = new A052220();
    while (true) {
      final Z t = a.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}
