package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014719.
 * @author Sean A. Irvine
 */
public class A014719 extends A014410 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

