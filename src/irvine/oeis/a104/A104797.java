package irvine.oeis.a104;
// manually trisumm/trisimple at 2023-06-09 19:35

import irvine.oeis.a001.A001924;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A104797 Triangle T(n,k) = Fib(n-k+4)-n-k-3, n&gt;=1, 0&lt;=k&lt;n, read by rows.
 * @author Georg Fischer
 */
public class A104797 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A104797() {
    super(1, new A001924().skip(1));
  }
}
