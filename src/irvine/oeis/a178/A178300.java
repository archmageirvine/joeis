package irvine.oeis.a178;
// Generated by gen_seq4.pl trimirr/trimirror at 2023-08-07 19:48

import irvine.oeis.a176.A176992;
import irvine.oeis.triangle.Transpose;

/**
 * A178300 Triangle T(n,k) = binomial(n+k-1,n) read by rows, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A178300 extends Transpose {

  /** Construct the sequence. */
  public A178300() {
    super(1, new A176992());
  }
}
