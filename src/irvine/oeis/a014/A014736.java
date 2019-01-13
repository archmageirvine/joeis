package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014736.
 * @author Sean A. Irvine
 */
public class A014736 extends A014493 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
