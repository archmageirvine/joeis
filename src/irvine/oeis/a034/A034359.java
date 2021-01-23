package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034359 Number of binary [ n,5 ] codes.
 * @author Sean A. Irvine
 */
public class A034359 extends A034356 {

  private int mN = 0;

  @Override
  public Z next() {
    return v(++mN, 5);
  }
}

