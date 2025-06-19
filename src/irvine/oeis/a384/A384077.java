package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a193.A193678;

/**
 * A384077 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384077 extends Sequence1 {

  private final Sequence mA = new A193678();
  private final Sequence mB = new A384074();
  private long mS = 1;
  private int mC = 0;

  @Override
  public Z next() {
    if (++mC == 2) {
      mS = -mS;
      mC = 0;
    }
    return mA.next().multiply(mS).subtract(mB.next()).divide2();
  }
}
