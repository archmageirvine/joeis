package irvine.oeis.a345;

import irvine.math.z.Z;

/**
 * A345710.
 * @author Sean A. Irvine
 */
public class A345710 extends A345530 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
