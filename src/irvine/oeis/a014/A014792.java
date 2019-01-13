package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014792.
 * @author Sean A. Irvine
 */
public class A014792 extends A014640 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
