package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A384874 a(n) is the first prime encountered when iterating the map x -&gt; x/2 if x is even, x*lpf(x) + 1 otherwise, where lpf(x) is the least prime factor of x, on n &gt;= 2; or -1 if a prime is never reached.
 * @author Sean A. Irvine
 */
public class A384874 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      if (m.isEven()) {
        m = m.divide2();
      } else {
        m = m.multiply(Functions.LPF.z(m)).add(1);
      }
    }
    return m;
  }
}
