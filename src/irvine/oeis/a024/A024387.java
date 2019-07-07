package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000384;

/**
 * A024387.
 * @author Sean A. Irvine
 */
public class A024387 extends A024380 {

  private final Sequence mA = new A000384();
  {
    mA.next();
    mA.next();
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
