package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a013.A013947;

/**
 * A022297.
 * @author Sean A. Irvine
 */
public class A022297 extends A013947 {

  @Override
  public Z next() {
    return Z.ONE.max(super.next().subtract(1));
  }
}
