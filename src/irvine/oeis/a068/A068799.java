package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002858;

/**
 * A068799 Ulam numbers such that n/2 is also an Ulam number.
 * @author Sean A. Irvine
 */
public class A068799 extends Sequence1 {

  private final Sequence mA = new A002858();
  private final Sequence mB = new A002858();
  private Z mT = mB.next();

  @Override
  public Z next() {
    while (true) {
      final Z u2 = mA.next().multiply2();
      while (mT.compareTo(u2) < 0) {
        mT = mB.next();
      }
      if (u2.equals(mT)) {
        return u2;
      }
    }
  }
}
