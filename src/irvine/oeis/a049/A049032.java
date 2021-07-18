package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049032 A049031/2.
 * @author Sean A. Irvine
 */
public class A049032 extends A049031 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
