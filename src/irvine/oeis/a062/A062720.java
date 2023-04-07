package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062720 If n is odd then 2*n else prime(n).
 * @author Sean A. Irvine
 */
public class A062720 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    return (++mN & 1) == 0 ? p : Z.valueOf(2 * mN);
  }
}

