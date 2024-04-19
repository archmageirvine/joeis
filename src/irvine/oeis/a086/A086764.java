package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a068.A068106;

/**
 * A086764 Triangle T(n, k), read by row, related to Euler's difference table A068106 (divide column k of A068106 by k!).
 * @author Georg Fischer
 */
public class A086764 extends A068106 {

  @Override
  public Z next() {
    return mCol < 1
      ? super.next()
      : super.next().divide(Functions.FACTORIAL.z(mCol));
  }
}
