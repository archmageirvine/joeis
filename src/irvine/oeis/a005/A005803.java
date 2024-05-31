package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005803 Second-order Eulerian numbers: a(n) = 2^n - 2*n.
 * @author Sean A. Irvine
 */
public class A005803 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.valueOf(-mN);
    }
    return Functions.EULERIAN2.z(mN, 1L);
  }
}
