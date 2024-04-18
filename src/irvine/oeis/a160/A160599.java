package irvine.oeis.a160;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A160599 Composite numbers n for which n - phi(n) divides n-1.
 * @author Sean A. Irvine
 */
public class A160599 extends Sequence1 {

  private Z mN = Z.valueOf(13);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
        final Z phi = Functions.PHI.z(mN);
        if (mN.subtract(1).mod(mN.subtract(phi)).isZero()) {
          return mN;
        }
      }
    }
  }
}

