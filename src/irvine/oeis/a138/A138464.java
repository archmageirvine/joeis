package irvine.oeis.a138;
// Generated by gen_seq4.pl A105599/trimirror at 2023-07-12 19:21

import irvine.oeis.a105.A105599;
import irvine.oeis.triangle.Transpose;

/**
 * A138464 Triangle read by rows: T(n, k) is the number of forests on n labeled nodes with k edges. T(n, k) for n &gt;= 1 and 0 &lt;= k &lt;= n-1.
 * @author Georg Fischer
 */
public class A138464 extends Transpose {

  /** Construct the sequence. */
  public A138464() {
    super(1, new A105599());
  }
}
