package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014764.
 * @author Sean A. Irvine
 */
public class A014764 extends A014631 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
