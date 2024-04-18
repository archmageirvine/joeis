package irvine.oeis.a066;

import irvine.math.function.Functions;
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
      if (Functions.PHI.z(mN.add(2)).subtract(Functions.PHI.z(mN.add(1)).multiply2()).add(Functions.PHI.z(mN)).add(mN).isZero()) {
        return mN;
      }
    }
  }
}
