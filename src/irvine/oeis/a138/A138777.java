package irvine.oeis.a138;
// Generated by gen_seq4.pl 2024-04-25/tablamb at 2024-04-25 23:20

import irvine.math.z.Binomial;
import irvine.oeis.triangle.LambdaTable;

/**
 * A138777 Triangle read by rows: T(n,k)=binomial(n-2k,3k+2) (n&gt;=2, 0&lt;=k&lt;=(n-2)/5).
 * @author Georg Fischer
 */
public class A138777 extends LambdaTable {

  /** Construct the sequence. */
  public A138777() {
    super(2, 2, n -> new Integer[]{0, (n - 2) / 5}, (n, k) -> Binomial.binomial(n - 2L * k, 3L * k + 2));
  }
}
