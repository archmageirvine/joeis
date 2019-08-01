package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A025000.
 * @author Sean A. Irvine
 */
public class A025000 implements Sequence {

  private final Sequence mNonPrimes = new ComplementSequence(new A000040(), Z.ZERO);
  private Z mN = null;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.THREE;
    } else {
      final Z t = mN;
      while (!mM.equals(t)) {
        mM = mM.add(1);
        mN = mNonPrimes.next();
      }
    }
    return mN;
  }
}
