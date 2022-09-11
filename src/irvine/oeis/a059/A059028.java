package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A059028 Row sums of A059026: a(n) = sum( lcm(n,m)/n + lcm(n,m)/m - 1, m = 1..n ).
 * @author Sean A. Irvine
 */
public class A059028 extends A059026 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> super.next());
  }
}
