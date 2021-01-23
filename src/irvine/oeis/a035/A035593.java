package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035593 A035539 with periodic zeros stripped.
 * @author Sean A. Irvine
 */
public class A035593 extends A035539 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}

