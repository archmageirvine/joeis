package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383777 allocated for Ya-Ping Lu.
 * @author Sean A. Irvine
 */
public class A383777 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (!m.isZero()) {
      if (m.isEven()) {
        m = m.multiply2().add(1);
      } else if (m.isOne()) {
        m = Z.ZERO;
      } else {
        m = m.subtract(Functions.LPF.z(m));
      }
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
