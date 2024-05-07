package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052221;

/**
 * A069526 Smallest multiple of n with digit sum = 7, or 0 if no such number exists, e.g. a(3k)= a(11k) = 0.
 * @author Sean A. Irvine
 */
public class A069526 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 3 == 0 || mN % 11 == 0 || mN % 37 == 0 || mN % 101 == 0 || mN % 271 == 0) {
      return Z.ZERO;
    }
    final Sequence a = new A052221();
    while (true) {
      final Z t = a.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}
