package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096024 Numbers n such that (n+j) mod (2+j) = 1 for j from 0 to 5 and (n+6) mod 8 &lt;&gt; 1.
 * @author Sean A. Irvine
 */
public class A096024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096024() {
    super(new long[] {-1, 2}, new long[] {423, 1263});
  }
}
