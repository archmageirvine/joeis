package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000165;
import irvine.oeis.a005.A005867;

/**
 * A065412 (A005867 - A000165)/96.
 * @author Sean A. Irvine
 */
public class A065412 extends A005867 {

  private final Sequence mA = new A000165();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide(96);
  }
}
