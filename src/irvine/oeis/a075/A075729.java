package irvine.oeis.a075;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075729 Number of different hierarchical orderings that can be formed from n labeled elements: these are divided into groups and the elements in each group are then arranged in a "preferential arrangement" or "weak order" as in A000670.
 * @author Sean A. Irvine
 */
public class A075729 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunction1<Z> mB = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return n < 2 ? Z.ONE : get(n - 1).multiply(2L * n - 1).subtract(get(n - 2).multiply(n - 1).multiply(n - 2));
    }
  };

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Functions.STIRLING2.z(mN, k).multiply(mB.get(k)));
  }
}
