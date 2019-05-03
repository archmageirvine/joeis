package irvine.oeis.a020;

import irvine.math.MemoryFunction2;
import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020555 Number of multigraphs on n labeled edges (with loops). Also number of genetically distinct states amongst n individuals.
 * @author Sean A. Irvine
 */
public class A020555 extends MemoryFunction2<Integer, Z>  implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final Integer m, final Integer n) {
    if (n == 0) {
      return BellNumbers.bell(m);
    }
    Z sum = get(m + 2, n - 1).add(get(m + 1, n - 1));
    for (int k = 0; k < n; ++k) {
      sum = sum.add(Binomial.binomial(n - 1, k).multiply(get(m, k)));
    }
    return sum.divide2();
  }

  @Override
  public Z next() {
    return get(0, ++mN);
  }
}
