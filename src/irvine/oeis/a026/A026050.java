package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.Sequence;

/**
 * A026050 <code>a(n) = (d(n)-r(n))/2</code>, where d <code>= A026049</code> and r is the periodic sequence with fundamental period <code>(1,0,0,1)</code>.
 * @author Sean A. Irvine
 */
public class A026050 extends A026049 {

  private final Sequence mS = new PeriodicSequence(1, 0, 0, 1);

  @Override
  public Z next() {
    return super.next().subtract(mS.next()).divide2();
  }
}

