package irvine.oeis.a259;
// Generated by gen_seq4.pl trimirr/trimirror at 2023-08-07 19:48

import irvine.oeis.a137.A137679;
import irvine.oeis.triangle.Transpose;

/**
 * A259324 Infinite square array read by antidiagonals: T(n,k) = number of ways of partitioning numbers &lt;= n into k parts (n &gt;= 0, k &gt;= 1).
 * @author Georg Fischer
 */
public class A259324 extends Transpose {

  /** Construct the sequence. */
  public A259324() {
    super(0, new A137679());
  }
}
