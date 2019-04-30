package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Euler;

/**
 * A160599 Composite numbers n for which <code>n - phi(n)</code> divides <code>n-1</code>.
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
        if (Z.ZERO.equals(mN.subtract(1).mod(mN.subtract(phi)))) {
          return mN;
        }
      }
    }
  }
}

