package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000392;

/**
 * A028243.
 * @author Sean A. Irvine
 */
public class A028243 extends A000392 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
