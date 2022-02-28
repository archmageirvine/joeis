package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000273;
import irvine.oeis.a003.A003085;
import irvine.oeis.a003.A003086;

/**
 * A054932 Number of unlabeled connected digraphs up to complementarity.
 * @author Sean A. Irvine
 */
public class A054932 extends A003085 {

  private final Sequence mA = new A000273();
  private final Sequence mB = new A003086();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next().subtract(mB.next()).divide2());
  }
}
