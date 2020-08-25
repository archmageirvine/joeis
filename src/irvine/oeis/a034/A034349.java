package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034349 Number of binary [ n,8 ] codes without 0 columns.
 * @author Sean A. Irvine
 */
public class A034349 extends A034253 {

  private int mN = 0;

  @Override
  public Z next() {
    return u(++mN, 8);
  }
}

