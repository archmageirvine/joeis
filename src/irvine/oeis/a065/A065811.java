package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065811 a(n) = A065810(n)-1.
 * @author Sean A. Irvine
 */
public class A065811 extends A065810 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
