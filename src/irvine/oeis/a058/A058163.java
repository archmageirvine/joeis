package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a034.A034383;

/**
 * A058163 Number of labeled groups with a fixed identity.
 * @author Sean A. Irvine
 */
public class A058163 extends A034383 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
