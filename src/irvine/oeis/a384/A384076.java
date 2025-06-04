package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a193.A193678;

/**
 * A384076 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384076 extends Sequence1 {

  private final Sequence mA = new A193678();
  private final Sequence mB = new A384074();
  private long mS = -1;

  @Override
  public Z next() {
    mS = -mS;
    return mA.next().multiply(mS).add(mB.next()).divide2();
  }
}
