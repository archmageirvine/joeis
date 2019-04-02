package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000157 Number of Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000157 extends A000370 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

