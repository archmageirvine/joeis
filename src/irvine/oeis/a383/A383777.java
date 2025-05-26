package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383777 a(n) is the number of steps that n requires to reach 0 under the map: x -&gt; 2*x + 1 if x is even; 0 if x = 1; x - lpf(x) otherwise where lpf(x) is the least prime factor of x. a(n) = -1 if 0 is never reached.
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
