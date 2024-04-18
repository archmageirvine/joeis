package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066497 Least number k such that phi(k) / Carmichael lambda(k) = 2n.
 * @author Sean A. Irvine
 */
public class A066497 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (Functions.PHI.z(k).equals(Carmichael.lambda(k).multiply(mN))) {
        return k;
      }
    }
  }
}
