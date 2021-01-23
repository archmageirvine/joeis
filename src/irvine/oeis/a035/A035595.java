package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035595 A035550 with periodic zeros stripped.
 * @author Sean A. Irvine
 */
public class A035595 extends A035550 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

