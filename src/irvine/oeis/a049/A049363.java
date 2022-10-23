package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049363 a(1) = 1; for n&gt;1, smallest digitally balanced number in base n.
 * @author Sean A. Irvine
 */
public class A049363 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z a = Z.ONE.multiply(mN);
    for (long d = 2; d < mN; ++d) {
      a = a.multiply(mN).add(d);
    }
    return a;
  }
}
