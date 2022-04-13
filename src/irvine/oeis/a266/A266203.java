package irvine.oeis.a266;

import irvine.math.z.Z;
import irvine.oeis.a056.A056041;

/**
 * A266203 Number of steps k to make g_k(n) converge to zero.
 * @author Sean A. Irvine
 */
public class A266203 extends A056041 {

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
