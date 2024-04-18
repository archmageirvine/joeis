package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051487 Numbers k such that phi(k) = phi(k - phi(k)).
 * @author Sean A. Irvine
 */
public class A051487 extends MemorySequence {

  {
    setOffset(1);
  }

  private Z mN = Z.ONE;

  @Override
  protected Z computeNext() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Functions.PHI.z(mN);
      if (phi.equals(Functions.PHI.z(mN.subtract(phi)))) {
        return mN;
      }
    }
  }
}
