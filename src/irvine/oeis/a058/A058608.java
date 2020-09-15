package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a161.A161970;

/**
 * A058608 McKay-Thompson series of class 28C for Monster.
 * @author Sean A. Irvine
 */
public class A058608 extends A161970 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
