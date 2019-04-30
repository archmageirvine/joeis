package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027383 Number of balanced strings of length n: let d(S) = #(1's) - #(0's), <code># ==</code> count in S, then S is balanced if every substring T of S has <code>-2 &lt;=</code> d(T) <code>&lt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A027383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027383() {
    super(new long[] {-2, 2, 1}, new long[] {1, 2, 4});
  }
}
