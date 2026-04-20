package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084493 a(n) = n + A084511(n) - 3.
 * @author Sean A. Irvine
 */
public class A084493 extends A084511 {

  private long mN = -3;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
