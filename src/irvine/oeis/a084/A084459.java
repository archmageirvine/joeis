package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084459 a(n) = n + A084458(n) - 3.
 * @author Sean A. Irvine
 */
public class A084459 extends A084458 {

  private long mN = -3;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
