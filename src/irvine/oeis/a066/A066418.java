package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A066418 Numbers k for which phi(k) + anti-phi(k) = k.
 * @author Sean A. Irvine
 */
public class A066418 extends Sequence1 {

  private final Sequence mAntiPhi = new A066452();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.PHI.z(mN).add(mAntiPhi.next()).equals(mN)) {
        return mN;
      }
    }
  }
}
