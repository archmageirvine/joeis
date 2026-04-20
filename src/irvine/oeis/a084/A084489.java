package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084489 a(n) = n + A084501(n) - 3.
 * @author Sean A. Irvine
 */
public class A084489 extends A084501 {

  private long mN = -3;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
