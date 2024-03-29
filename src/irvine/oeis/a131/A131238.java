package irvine.oeis.a131;
// Generated by gen_seq4.pl trisumm/trisimple at 2023-06-07 21:43

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A131238 Triangle read by rows: T(n,k) = 2*binomial(n,k) - binomial(floor((n+k)/2), k) (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A131238 extends BaseTriangle {

  /** Construct the sequence. */
  public A131238() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n, k).multiply2().subtract(Binomial.binomial((n + k) / 2, k));
  }
}
