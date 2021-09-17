package irvine.oeis.a051;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051488 Numbers k such that phi(k) &lt; phi(k - phi(k)).
 * @author Sean A. Irvine
 */
public class A051488 extends MemorySequence {

  private Z mN = Z.ONE;

  @Override
  protected Z computeNext() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Euler.phi(mN);
      if (phi.compareTo(Euler.phi(mN.subtract(phi))) < 0) {
        return mN;
      }
    }
  }
}
