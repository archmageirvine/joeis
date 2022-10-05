package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059733 Central column a(n,[n/2]) of A059922.
 * @author Sean A. Irvine
 */
public class A059733 extends A059922 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN / 2, mN);
  }
}

