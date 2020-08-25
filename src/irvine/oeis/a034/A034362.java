package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034362 Number of binary [ n,8 ] codes.
 * @author Sean A. Irvine
 */
public class A034362 extends A034356 {

  private int mN = 0;

  @Override
  public Z next() {
    return v(++mN, 8);
  }
}

