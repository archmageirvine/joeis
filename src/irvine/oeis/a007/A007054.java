package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A007054.
 * @author Sean A. Irvine
 */
public class A007054 extends A000108 {

  @Override
  public Z next() {
    return super.next().multiply(6).divide(mN + 2);
  }
}
