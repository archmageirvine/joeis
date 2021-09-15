package irvine.oeis.a051;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051459 Number of orderings of the subsets of a set with n elements that are compatible with the subsets' sizes; i.e., if A, B are two subsets with A &lt;= B then Card(A) &lt;= Card(B).
 * @author Sean A. Irvine
 */
public class A051459 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      prod = prod.multiply(mF.factorial(Binomial.binomial(mN, k).intValueExact()));
    }
    return prod;
  }
}
