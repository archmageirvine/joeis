package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a005.A005473;

/**
 * A056904 Floor[p/24] where p is a prime which is 4 more than a square.
 * @author Sean A. Irvine
 */
public class A056904 extends A005473 {

  @Override
  public Z next() {
    return super.next().divide(24);
  }
}
