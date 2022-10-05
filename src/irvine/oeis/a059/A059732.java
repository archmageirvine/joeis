package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059732 Central column (even terms a(2*n,n)) of A059922.
 * @author Sean A. Irvine
 */
public class A059732 extends A059922 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN);
  }
}

