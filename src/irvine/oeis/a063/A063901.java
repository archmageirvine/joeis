package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a153.A153485;

/**
 * A063901 Numbers k such that Sum_{j=1..k} A001065(j) is divisible by k.
 * @author Sean A. Irvine
 */
public class A063901 extends A153485 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
