package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022758.
 * @author Sean A. Irvine
 */
public class A022758 extends A022757 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
