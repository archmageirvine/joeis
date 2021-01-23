package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035594 A035544 with periodic zeros removed.
 * @author Sean A. Irvine
 */
public class A035594 extends A035544 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

