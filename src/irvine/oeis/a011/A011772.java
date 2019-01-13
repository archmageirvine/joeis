package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011772.
 * @author Sean A. Irvine
 */
public class A011772 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      if (m.multiply(m.add(1)).divide2().mod(mN) == 0) {
        return m;
      }
    }
  }
}
