package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066765 Numbers k such that phi(k) &lt; k/5.
 * @author Sean A. Irvine
 */
public class A066765 extends Sequence1 {

  private long mN = 30029;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Functions.PHI.z(n).multiply(5).longValueExact() < mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

