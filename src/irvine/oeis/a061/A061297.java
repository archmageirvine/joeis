package irvine.oeis.a061;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a067.A067049;

/**
 * A061297 a(n) = Sum_{ r = 0 to n} L(n,r), where L(n,r) (A067049) = lcm(n, n-1, n-2, ..., n-r+1)/lcm(1, 2, 3, ..., r).
 * @author Sean A. Irvine
 */
public class A061297 extends A067049 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
