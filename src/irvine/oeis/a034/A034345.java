package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034345 Number of binary [ n,4 ] codes without 0 columns.
 * @author Sean A. Irvine
 */
public class A034345 extends A034253 {

  private int mN = 0;

  @Override
  public Z next() {
    return u(++mN, 4);
  }
}

