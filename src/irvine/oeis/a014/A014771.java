package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014771.
 * @author Sean A. Irvine
 */
public class A014771 extends A014634 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
