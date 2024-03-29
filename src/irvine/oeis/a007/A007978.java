package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007978 Least non-divisor of n.
 * @author Sean A. Irvine
 */
public class A007978 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (mN % ++m == 0) {
      // do nothing
    }
    return Z.valueOf(m);
  }
}
