package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.Sequence;

/**
 * A026051 a(n) = (d(n)-r(n))/5, where d = A026049 and r is the periodic sequence with fundamental period (4,1,4,0,1).
 * @author Sean A. Irvine
 */
public class A026051 extends A026049 {

  private final Sequence mS = new PeriodicSequence(4, 1, 4, 0, 1);

  @Override
  public Z next() {
    return super.next().subtract(mS.next()).divide(5);
  }
}

