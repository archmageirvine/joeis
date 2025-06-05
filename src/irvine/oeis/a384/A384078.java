package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a193.A193678;

/**
 * A384078 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384078 extends Sequence1 {

  private final Sequence mA = new A193678();
  private final Sequence mB = new A384075();
  private long mS = -1;

  @Override
  public Z next() {
    mS = -mS;
    return mA.next().add(mB.next()).divide2();
  }
}
