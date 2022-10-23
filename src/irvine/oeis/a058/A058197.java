package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000005;

/**
 * A058197 Where d(m) (number of divisors, A000005) rises by at least n.
 * @author Sean A. Irvine
 */
public class A058197 extends Sequence1 {

  private final Sequence mA = new DifferenceSequence(new A000005());
  private Z mT = mA.next();
  private Z mM = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mT.compareTo(mN) < 0) {
      mM = mM.add(1);
      mT = mA.next();
    }
    return mM;
  }
}
