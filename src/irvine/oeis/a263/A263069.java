package irvine.oeis.a263;

import irvine.math.z.Z;
import irvine.oeis.a262.A262809;

/**
 * A263069 Number of lattice paths from {n}^9 to {0}^9 using steps that decrement one or more components by one.
 * @author Sean A. Irvine
 */
public class A263069 extends A262809 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 9);
  }
}

