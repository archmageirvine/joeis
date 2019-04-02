package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014688 a(n) = n-th prime + n.
 * @author Sean A. Irvine
 */
public class A014688 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
