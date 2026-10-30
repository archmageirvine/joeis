package irvine.oeis.a087;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a401.A401566;

/**
 * A087101 Number of symmetric quartic graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A087101 extends Sequence1 {

  private final DirectSequence mC = DirectSequence.create(new A401566());
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, mC::a);
  }
}
