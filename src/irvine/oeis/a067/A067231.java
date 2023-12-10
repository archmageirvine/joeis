package irvine.oeis.a067;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067231 Number of Young tableaux with n=i*j cells and type i*j matrices with i&gt;=j.
 * @author Sean A. Irvine
 */
public class A067231 extends Sequence1 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final Z nf = F.factorial(++mN);
    return Integers.SINGLETON.sumdiv(mN, d -> d * d < mN ? Z.ZERO : Rationals.SINGLETON.product(0, mN / d - 1, k -> new Q(F.factorial(k), F.factorial(d + k))).multiply(nf).toZ());
  }
}

