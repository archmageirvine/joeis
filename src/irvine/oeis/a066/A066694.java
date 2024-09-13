package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066694 Numbers k such that phi(sigma(k)) &gt; k.
 * @author Sean A. Irvine
 */
public class A066694 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.PHI.z(Functions.SIGMA1.z(mN)).compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}
