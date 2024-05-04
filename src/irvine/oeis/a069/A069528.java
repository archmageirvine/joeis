package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052223;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069528 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 11 == 0 || mN % 101 == 0 || mN % 271 == 0 || mN % 999 == 0 || mN % 4649 == 0) {
      return Z.ZERO;
    }
    final Sequence a = new A052223();
    while (true) {
      final Z t = a.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}
