package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.Sequence;

/**
 * A026051 <code>a(n) = (d(n)-r(n))/5</code>, where d <code>= A026049</code> and r is the periodic sequence with fundamental period <code>(4,1,4,0,1)</code>.
 * @author Sean A. Irvine
 */
public class A026051 extends A026049 {

  private final Sequence mS = new PeriodicSequence(4, 1, 4, 0, 1);

  @Override
  public Z next() {
    return super.next().subtract(mS.next()).divide(5);
  }
}

