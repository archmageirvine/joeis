package irvine.oeis.a050;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050472 Numbers m such that 2*phi(m) = phi(m+1).
 * @author Sean A. Irvine
 */
public class A050472 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(mN).multiply2().equals(Euler.phi(mN.add(1)))) {
        return mN;
      }
    }
  }
}
