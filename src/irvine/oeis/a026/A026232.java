package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026232.
 * @author Sean A. Irvine
 */
public class A026232 extends A026231 {

  @Override
  public Z next() {
    return super.next().add(1).divide(3);
  }
}
