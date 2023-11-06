package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066765 Numbers n such that phi(n) &lt; n/5.
 * @author Sean A. Irvine
 */
public class A066765 extends Sequence1 {

  private long mN = 30029;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(++mN).multiply(5).longValueExact() < mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

