package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073362 Nested floor product of n and fractions (k+1)/k for all k&gt;0 (mod 5), divided by 5.
 * @author Sean A. Irvine
 */
public class A073362 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      if (++k % 5 != 0) {
        final Z t = m;
        m = m.multiply(k + 1).divide(k);
        if (t.equals(m)) {
          return m.divide(5);
        }
      }
    }
  }
}
