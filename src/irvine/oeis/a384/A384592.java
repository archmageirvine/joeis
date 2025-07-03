package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a123.A123745;

/**
 * A384592 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384592 extends Sequence1 {

  private long mN = -1;
  private final Sequence mD = new A123745();
  private final Sequence mP = new A384591().skip();

  @Override
  public Z next() {
    return mD.next().multiply(Z.NEG_ONE.pow(++mN)).subtract(mP.next()).divide2();
  }
}

