package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038699 Smallest prime of form n*2^m-1, m &gt;= 0, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A038699 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (true) {
      final Z s = m.subtract(1);
      if (s.isProbablePrime()) {
        return s;
      }
      m = m.multiply2();
    }
  }
}
