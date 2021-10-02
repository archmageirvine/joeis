package irvine.oeis.a072;
// manually pastrico at 2021-10-01 20:56

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.BorderedTriangleRecurrence;
import irvine.oeis.a000.A000012;

/**
 * A072405 Triangle T(n, k) = C(n,k) - C(n-2,k-1) for n &gt;= 3 and T(n, k) = 1 otherwise, read by rows.
 * @author Georg Fischer
 */
public class A072405 extends BorderedTriangleRecurrence {

  /** Construct the sequence. */
  public A072405() {
    super(new A000012(), new A000012());
  }
  
  @Override
  protected Z compute(final int n, final int k) {
    return n >= 3 ? Binomial.binomial(n, k).subtract(Binomial.binomial(n - 2, k - 1)) : Z.ONE;
  }
}
