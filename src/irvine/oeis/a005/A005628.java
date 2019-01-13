package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005628.
 * @author Sean A. Irvine
 */
public class A005628 extends A005627 {

  private int mN = -1;

  @Override
  public Z next() {
    return getS(++mN).subtract(super.next());
  }
}


