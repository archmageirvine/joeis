package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014735.
 * @author Sean A. Irvine
 */
public class A014735 extends A014461 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
