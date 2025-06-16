package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A384698 The first prime number reached by iterating the map, x -&gt; 2*x + 1 if x is even; x - lpf(x) otherwise where lpf(x) is the least prime factor of x, on n &gt;= 2; or -1 if a prime is never reached.
 * @author Sean A. Irvine
 */
public class A384698 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      if (m.isEven()) {
        m = m.multiply2().add(1);
      } else if (m.isOne()) {
        m = Z.ZERO;
      } else {
        m = m.subtract(Functions.LPF.z(m));
      }
    }
    return m;
  }
}
