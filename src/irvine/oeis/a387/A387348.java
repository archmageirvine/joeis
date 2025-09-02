package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035506;
import irvine.oeis.a035.A035513;

/**
 * A387348 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A387348 extends Sequence1 {

  private final A035513 mWythoff = new A035513();
  private long mN = 0;

  @Override
  public Z next() {
    return mWythoff.get(++mN, 2L).subtract(A035506.stolarsky(mN, 2L));
  }
}

