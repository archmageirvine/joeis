package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;

/**
 * A058199 Where d(m) (number of divisors, A000005) falls by at least n.
 * @author Sean A. Irvine
 */
public class A058199 implements Sequence {

  private final Sequence mA = new DifferenceSequence(new A000005());
  private Z mT = mA.next();
  private Z mM = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mT.negate().compareTo(mN) < 0) {
      mM = mM.add(1);
      mT = mA.next();
    }
    return mM;
  }
}
