package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034357 Number of binary [ n,3 ] codes.
 * @author Sean A. Irvine
 */
public class A034357 extends A034356 {

  private int mN = 0;

  @Override
  public Z next() {
    return v(++mN, 3);
  }
}

