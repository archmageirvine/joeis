package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Euler;

/**
 * A160599 Composite numbers n for which n - phi(n) divides n-1.
 * @author Sean A. Irvine
 */
public class A160599 implements Sequence {

  private Z mN = Z.valueOf(13);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
        final Z phi = Euler.phi(mN);
        if (mN.subtract(1).mod(mN.subtract(phi)).isZero()) {
          return mN;
        }
      }
    }
  }
}

