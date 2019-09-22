package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026230.
 * @author Sean A. Irvine
 */
public class A026230 extends A026229 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
