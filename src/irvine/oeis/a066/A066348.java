package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066348 Numbers n such that phi(n+2) - 2*phi(n+1) + phi(n) = -n.
 * @author Sean A. Irvine
 */
public class A066348 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(mN.add(2)).subtract(Euler.phi(mN.add(1)).multiply2()).add(Euler.phi(mN)).add(mN).isZero()) {
        return mN;
      }
    }
  }
}
