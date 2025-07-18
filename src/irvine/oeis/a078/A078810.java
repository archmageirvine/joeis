package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078810 extends A078218 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
