package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068590.
 * @author Sean A. Irvine
 */
public class A068640 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z res = Z.ZERO;
    Z s = Z.valueOf(++mN);
    while ((s = s.multiply2().add(1)).isProbablePrime()) {
      res = s;
    }
    return res;
  }
}
