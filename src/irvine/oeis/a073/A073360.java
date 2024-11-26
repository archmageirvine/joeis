package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073360 Nested floor product of n and fractions (k+1)/k for all k&gt;0 (mod 3), divided by 3.
 * @author Sean A. Irvine
 */
public class A073360 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      if (++k % 3 != 0) {
        final Z t = m;
        m = m.multiply(k + 1).divide(k);
        if (t.equals(m)) {
          return m.divide(3);
        }
      }
    }
  }
}
