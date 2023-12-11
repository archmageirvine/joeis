package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A026050 a(n) = (d(n)-r(n))/2, where d = A026049 and r is the periodic sequence with fundamental period (1,0,0,1).
 * @author Sean A. Irvine
 */
public class A026050 extends A026049 {

  private final Sequence mS = new PeriodicSequence(1, 0, 0, 1);

  @Override
  public Z next() {
    return super.next().subtract(mS.next()).divide2();
  }
}

