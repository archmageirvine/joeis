package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.Sequence;

/**
 * A026059 <code>a(n) = (d(n)-r(n))/5</code>, where d <code>= A026057</code> and r is the periodic sequence with fundamental period <code>(1,0,3,1,0)</code>.
 * @author Sean A. Irvine
 */
public class A026059 extends A026057 {

  private final Sequence mS = new PeriodicSequence(1, 0, 3, 1, 0);
  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mS.next()).divide(5);
  }
}

