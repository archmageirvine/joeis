package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A002503 Numbers n such that <code>binomial(2n,n)</code> is divisible by <code>(n+1)^2</code>.
 * @author Sean A. Irvine
 */
public class A002503 extends A000108 {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0 && mN > 1) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
