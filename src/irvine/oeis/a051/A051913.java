package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051913 Numbers n such that phi(n)/phi(phi(n)) = 3.
 * @author Sean A. Irvine
 */
public class A051913 extends Sequence1 {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Functions.PHI.z(mN);
      final Z phiPhi = Functions.PHI.z(phi);
      final Z[] qr = phi.divideAndRemainder(phiPhi);
      if (qr[1].isZero() && Z.THREE.equals(qr[0])) {
        return mN;
      }
    }
  }
}
