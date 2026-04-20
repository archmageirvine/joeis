package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084497 a(n) = n + A084521(n) - 3.
 * @author Sean A. Irvine
 */
public class A084497 extends A084521 {

  private long mN = -3;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
