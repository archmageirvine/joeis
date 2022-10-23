package irvine.oeis.a007;

import irvine.math.z.Eulerian2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007347 Maximal Eulerian numbers of second kind.
 * @author Sean A. Irvine
 */
public class A007347 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long m = 1; m < mN; ++m) {
      max = max.max(Eulerian2.SINGLETON.get(mN, m));
    }
    return max;
  }
}
