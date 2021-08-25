package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000994;
import irvine.oeis.a000.A000995;

/**
 * A051139 A000994-A000995.
 * @author Sean A. Irvine
 */
public class A051139 extends A000994 {

  private final Sequence mA = new A000995();
  {
    next();
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

