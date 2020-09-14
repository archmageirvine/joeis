package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a187.A187197;

/**
 * A058483 McKay-Thompson series of class 12E for the Monster group.
 * @author Sean A. Irvine
 */
public class A058483 extends A187197 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
