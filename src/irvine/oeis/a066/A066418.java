package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A066272 Number of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A066418 extends Sequence1 {

  private final Sequence mAntiPhi = new A066452();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(mN).add(mAntiPhi.next()).equals(mN)) {
        return mN;
      }
    }
  }
}
