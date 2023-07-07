package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a003.A003434;

/**
 * A064415 a(1) = 0, a(n) = iter(n) if n is even, a(n) = iter(n)-1 if n is odd, where iter(n) = A003434(n) = smallest number of iterations of Euler totient function phi needed to reach 1.
 * @author Sean A. Irvine
 */
public class A064415 extends A003434 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN & 1).max(Z.ZERO);
  }
}
