package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014726.
 * @author Sean A. Irvine
 */
public class A014726 extends A014421 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
