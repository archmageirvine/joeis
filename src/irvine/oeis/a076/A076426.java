package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076426 Fixed points of the mapping k -&gt; abs(reverse(lpd(k))-reverse(Lpf(k))). lpd(k) is the largest proper divisor and Lpf(k) is the largest prime factor of k.
 * @author Sean A. Irvine
 */
public class A076426 extends Sequence1 {

  private long mN = 5749;

  @Override
  public Z next() {
    while (true) {
      final Z m = Z.valueOf(++mN);
      final Z m1 = Functions.REVERSE.z(m.divide(Functions.LPF.z(m))).subtract(Functions.REVERSE.z(Functions.GPF.z(m))).abs();
      if (m1.equals(m)) {
        return m;
      }
    }
  }
}
