package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024734.
 * @author Sean A. Irvine
 */
public class A024734 extends A024733 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(7);
  }
}
