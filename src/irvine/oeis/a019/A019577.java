package irvine.oeis.a019;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019577 Place n distinguishable balls in n boxes (in n^n ways); let f(n,k) = number of ways that max in any box is k, for 1&lt;=k&lt;=n; sequence gives f(n,2)/n.
 * @author Sean A. Irvine
 */
public class A019577 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Z m = Functions.FACTORIAL.z(mN).multiply(Functions.FACTORIAL.z(mN - 1));
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(m.shiftRight(k).divide(Functions.FACTORIAL.z(k).square()).divide(Functions.FACTORIAL.z(mN - 2 * k)));
    }
    return sum;
  }
}
