package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014689.
 * @author Sean A. Irvine
 */
public class A014689 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
