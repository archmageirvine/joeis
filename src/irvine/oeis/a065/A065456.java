package irvine.oeis.a065;

import irvine.math.MemoryFunction1;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065456 Number of functions on n labeled nodes whose representation as a digraph has two components.
 * @author Sean A. Irvine
 */
public class A065456 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunction1<Z> mG = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return Integers.SINGLETON.sum(1, n, j -> Z.valueOf(n).pow(n - j).multiply(MemoryFactorial.SINGLETON.factorial(n - 1)).divide(MemoryFactorial.SINGLETON.factorial(n - j)));
    }
  };

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN, k).multiply(mG.get(k)).multiply(mG.get(mN - k))).divide2();
  }
}
