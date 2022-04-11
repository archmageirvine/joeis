package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000273;
import irvine.oeis.a003.A003086;

/**
 * A055969 Number of unlabeled digraphs with n nodes and an odd number of arcs.
 * @author Sean A. Irvine
 */
public class A055969 extends A000273 {

  private final Sequence mA = new A003086();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide2();
  }
}
