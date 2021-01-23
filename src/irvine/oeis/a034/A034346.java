package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034346 Number of binary [ n,5 ] codes without 0 columns.
 * @author Sean A. Irvine
 */
public class A034346 extends A034253 {

  private int mN = 0;

  @Override
  public Z next() {
    return u(++mN, 5);
  }
}

