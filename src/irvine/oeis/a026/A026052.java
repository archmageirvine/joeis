package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008778;

/**
 * A026052 <code>(d(n)-r(n))/2</code>, where d <code>= A008778</code> and r is the periodic sequence with fundamental period <code>(1,1,0,1)</code>.
 * @author Sean A. Irvine
 */
public class A026052 extends A008778 {

  private final Sequence mS = new PeriodicSequence(1, 1, 0, 1);
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mS.next()).divide2();
  }
}

