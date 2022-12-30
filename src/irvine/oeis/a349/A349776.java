package irvine.oeis.a349;
// manually 2022-12-26

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A349776 Triangle read by rows: T(n,k) is the number of partitions of set [n] into a set of at most k lists, with 0 &lt;= k &lt;= n. Also called broken permutations.
 * @author Georg Fischer
 */
public class A349776 extends BaseTriangle {

  /** Construct the sequence. */
  public A349776() {
    super(0, 0, 0);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // Sum_{j=0..k} binomial(n-1, n-j)*n!/j!.
    return Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(n - 1, n - j)
      .multiply(MemoryFactorial.SINGLETON.factorial(n))
      .divide(MemoryFactorial.SINGLETON.factorial(j)));
  }
}
