package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014692 <code>a(n) = prime(n) - (n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014692 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
