package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034344 Number of binary [ n,3 ] codes without 0 columns.
 * @author Sean A. Irvine
 */
public class A034344 extends A034253 {

  private int mN = 0;

  @Override
  public Z next() {
    return u(++mN, 3);
  }
}

