package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-02-22.ack/trilamb0 at 2025-02-22 21:47

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A352687 Triangle read by rows, a Narayana related triangle whose rows are refinements of twice the Catalan numbers (for n &gt;= 2).
 * @author Georg Fischer
 */
public class A352687 extends LambdaTriangle {

  /** Construct the sequence. */
  public A352687() {
    super(0, 0, 0, (n, k) -> k.equals(n) ? Z.ONE : ((n > 0 && k == 0) ? Z.ZERO : Binomial.binomial(n, k).multiply(Binomial.binomial(n - 1, k - 1)).divide(n - k + 1).subtract(Binomial.binomial(n - 1, k).multiply(2).multiply(Binomial.binomial(n - 1, k - 2)).divide(n - 1))));
  }
}
