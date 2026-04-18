package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084453 a(n) = n + A084452(n) - 3.
 * @author Sean A. Irvine
 */
public class A084453 extends A084452 {

  private long mN = -3;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
