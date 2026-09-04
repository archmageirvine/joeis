package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086442 a(n) = A086323(n)/n.
 * @author Sean A. Irvine
 */
public class A086442 extends A086323 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}

