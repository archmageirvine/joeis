package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a123.A123744;

/**
 * A384313 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384313 extends Sequence1 {

  private long mN = -1;
  private final Sequence mD = new A123744().skip();
  private final Sequence mP = new A384079().skip();

  @Override
  public Z next() {
    return mD.next().multiply(Z.NEG_ONE.pow(++mN)).add(mP.next()).divide2();
  }
}

