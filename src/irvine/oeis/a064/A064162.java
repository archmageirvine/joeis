package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064162 Least abundant number divisible by n.
 * @author Sean A. Irvine
 */
public class A064162 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = mN;
    while (true) {
      if (Functions.SIGMA.z(k).subtract(k).compareTo(k) > 0) {
        return k;
      }
      k = k.add(mN);
    }
  }
}
