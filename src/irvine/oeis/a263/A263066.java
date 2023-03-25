package irvine.oeis.a263;

import irvine.math.z.Z;
import irvine.oeis.a262.A262809;

/**
 * A263066 Number of lattice paths from {n}^6 to {0}^6 using steps that decrement one or more components by one.
 * @author Sean A. Irvine
 */
public class A263066 extends A262809 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}

