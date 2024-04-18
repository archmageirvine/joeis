package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036798 Odd m such that there exists an even number k &lt; m with phi(k) = phi(m).
 * @author Sean A. Irvine
 */
public class A036798 extends Sequence1 {

  private Z mN = Z.valueOf(103);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z phi = Functions.PHI.z(mN);
      for (final Z k : InverseEuler.inversePhi(phi)) {
        if (k.isEven() && k.compareTo(mN) < 0) {
          return mN;
        }
      }
    }
  }
}
