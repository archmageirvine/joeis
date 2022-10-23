package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A025000 a(1) = 3; a(n+1) = a(n)-th nonprime, where nonprimes begin at 0.
 * @author Sean A. Irvine
 */
public class A025000 extends Sequence1 {

  private final Sequence mNonPrimes = new ComplementSequence(new A000040(), start());
  private Z mN = null;
  private Z mM = Z.ZERO;

  protected Z start() {
    return Z.ZERO;
  }

  protected Z initial() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = initial();
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
