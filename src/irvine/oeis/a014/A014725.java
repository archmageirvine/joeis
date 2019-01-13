package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014725.
 * @author Sean A. Irvine
 */
public class A014725 extends A014414 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
