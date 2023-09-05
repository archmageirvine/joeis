package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a064.A064413;

/**
 * A065519 a(n) = A064413(n)-n.
 * @author Sean A. Irvine
 */
public class A065519 extends A064413 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
