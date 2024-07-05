package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071177 Square-root of concatenation n'k, where k is minimal with n'k square (decimal notation).
 * @author Sean A. Irvine
 */
public class A071177 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN).multiply(10);
    long k = -1;
    long m = 10;
    while (true) {
      if (++k >= m) {
        m *= 10;
        t = t.multiply(10);
      }
      final Z u = t.add(k);
      final Z s = u.sqrt();
      if (u.auxiliary() == 1) {
        return s;
      }
    }
  }
}
