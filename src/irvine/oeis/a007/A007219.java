package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a006.A006718;

/**
 * A007219.
 * @author Sean A. Irvine
 */
public class A007219 extends A006718 {

  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
