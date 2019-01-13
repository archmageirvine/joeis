package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A013525.
 * @author Sean A. Irvine
 */
public class A013525 extends A000364 {

  @Override
  public Z next() {
    return super.next().subtract(mN == 0 ? -1 : 1).divide2();
  }
}
