package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A066000.
 * @author Sean A. Irvine
 */
public class A066007 extends Sequence1 {

  // After Michael S. Branicky

  private int mN = 0;

  private Z k(final int r) {
    return Z.TEN.pow(r).subtract(1).divide(9).add(r + 2);
  }

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    int r = 0;
    while (k(r + 1).compareTo(n) <= 0) {
      ++r;
    }
    return new Z("1" + StringUtils.rep('0', r) + StringUtils.rep('9', mN - r - 1));
  }
}
