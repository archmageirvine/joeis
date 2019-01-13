package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a033.A033762;

/**
 * A005881.
 * @author Sean A. Irvine
 */
public class A005881 extends A033762 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
