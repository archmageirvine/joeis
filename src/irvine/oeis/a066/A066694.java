package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066694 Numbers n such that phi(sigma(n)) &gt; n.
 * @author Sean A. Irvine
 */
public class A066694 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(Functions.SIGMA.z(mN)).compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}
