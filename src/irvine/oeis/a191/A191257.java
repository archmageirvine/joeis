package irvine.oeis.a191;

import irvine.math.z.Z;
import irvine.oeis.a067.A067368;

/**
 * A191257 a(n) = A067368(n)/2.
 * @author Georg Fischer
 */
public class A191257 extends A067368 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
