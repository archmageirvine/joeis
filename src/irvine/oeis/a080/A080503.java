package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080503 a(n) = A080502(n)/n.
 * @author Sean A. Irvine
 */
public class A080503 extends A080502 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}

