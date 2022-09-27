package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a055.A055203;

/**
 * A059516 Number of different relations between n intervals (possibly of zero length) on a line.
 * @author Sean A. Irvine
 */
public class A059516 extends A055203 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mN == 0 ? 1 : 0);
  }
}
