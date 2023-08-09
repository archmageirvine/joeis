package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A064492 Start of n-th segment of Recam\u00e1n's sequence R(m) (A005132): values of n where the change in the fractional parts of successive values of R(n)/n is positive.
 * @author Sean A. Irvine
 */
public class A064492 extends Sequence1 {

  private final Sequence mRecaman = new A005132().skip();
  private Z mR = Z.NEG_ONE;
  private Z mN = Z.ZERO;

  protected Z select(final Z n, final Z r) {
    return n;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mN;
      mN = mN.add(1);
      final Z old = mR;
      mR = mRecaman.next().mod(mN);
      if (old.multiply(mN).compareTo(mR.multiply(t)) < 0) {
        return select(mN, mR);
      }
    }
  }
}
