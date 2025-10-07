package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388139.
 * @author Sean A. Irvine
 */
public class A389146 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final long r = Functions.RAD.l(mN);
    final long o = Functions.OMEGA.l(mN);
    return Z.valueOf(1 + (o > 1 ? 2 : 0) + (mN % (r * r) == 0 ? 1 : 0));
  }
}
