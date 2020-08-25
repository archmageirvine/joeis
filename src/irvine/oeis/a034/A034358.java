package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034358 Number of binary [ n,4 ] codes.
 * @author Sean A. Irvine
 */
public class A034358 extends A034356 {

  private int mN = 0;

  @Override
  public Z next() {
    return v(++mN, 4);
  }
}

