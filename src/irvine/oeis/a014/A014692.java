package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014692 a(n) = prime(n) - (n-1).
 * @author Sean A. Irvine
 */
public class A014692 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
