package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024726.
 * @author Sean A. Irvine
 */
public class A024726 extends A024725 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
