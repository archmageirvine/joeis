package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034347 Number of binary [ n,6 ] codes without 0 columns.
 * @author Sean A. Irvine
 */
public class A034347 extends A034253 {

  private int mN = 0;

  @Override
  public Z next() {
    return u(++mN, 6);
  }
}

