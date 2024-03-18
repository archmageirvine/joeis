package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068818 a(n) = smallest triangular number having no digit in common with the previous term, with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A068818 extends Sequence1 {

  private final Sequence mT = new A000217();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final int syn = ZUtils.syn(mA);
    while (true) {
      mA = mT.next();
      if ((ZUtils.syn(mA) & syn) == 0) {
        return mA;
      }
    }
  }
}
