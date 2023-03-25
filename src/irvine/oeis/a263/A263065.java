package irvine.oeis.a263;

import irvine.math.z.Z;
import irvine.oeis.a262.A262809;

/**
 * A263065 Number of lattice paths from {n}^5 to {0}^5 using steps that decrement one or more components by one.
 * @author Sean A. Irvine
 */
public class A263065 extends A262809 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

