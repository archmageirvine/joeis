package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034360 Number of binary [ n,6 ] codes.
 * @author Sean A. Irvine
 */
public class A034360 extends A034356 {

  private int mN = 0;

  @Override
  public Z next() {
    return v(++mN, 6);
  }
}

