package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014341.
 * @author Sean A. Irvine
 */
public class A014341 extends A014340 {

  @Override
  public Z next() {
    return super.next().divide(24);
  }
}

