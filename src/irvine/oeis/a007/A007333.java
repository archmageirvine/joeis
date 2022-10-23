package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007333 An upper bound on the biplanar crossing number of the complete graph on n nodes.
 * @author Sean A. Irvine
 */
public class A007333 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long k = ++mN / 4;
    switch ((int) (mN & 3)) {
      case 0:
        return Z.valueOf(k).multiply(k - 1).multiply(k - 2).multiply(7 * k - 3).divide(6);
      case 1:
        return Z.valueOf(k).multiply(k - 1).multiply(7 * k * k - 10 * k + 4).divide(6);
      case 2:
        return Z.valueOf(k).multiply(k - 1).multiply(7 * k * k - 3 * k - 1).divide(6);
      default: // 3
        return Z.valueOf(k).square().multiply(k - 1).multiply(7 * k + 4).divide(6);
    }
  }
}
