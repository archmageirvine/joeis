package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034361 Number of binary [ n,7 ] codes.
 * @author Sean A. Irvine
 */
public class A034361 extends A034356 {

  private int mN = 0;

  @Override
  public Z next() {
    return v(++mN, 7);
  }
}

