package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a007.A007468;

/**
 * A082749 Difference between the sum of next prime(n) natural numbers and the sum of next n primes.
 * @author Sean A. Irvine
 */
public class A082749 extends A000040 {

  private final Sequence mS = new A007468();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z sum = p.multiply(p.subtract(1).add(mN.multiply2())).divide2();
    mN = mN.add(p);
    return sum.subtract(mS.next());
  }
}
