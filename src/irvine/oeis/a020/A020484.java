package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020484.
 * @author Sean A. Irvine
 */
public class A020484 extends A020483 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
