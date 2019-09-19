package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026170.
 * @author Sean A. Irvine
 */
public class A026170 extends A026169 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
