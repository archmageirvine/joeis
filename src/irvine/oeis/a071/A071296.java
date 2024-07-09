package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071296 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 2) {
      return Z.ZERO;
    }
    final Q x = new Q(Functions.FIBONACCI.z(mN + 1).add(1), Z.TWO);
    return x.square().add(x.multiply(Functions.FIBONACCI.z(mN)).multiply(2).add(Functions.FIBONACCI.z(mN - 1)).divide(Functions.FIBONACCI.z(mN + 1))).toZ();
  }
}
