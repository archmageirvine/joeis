package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277830 Number of digits <code>'0'</code> in the set of all numbers from 0 to <code>A014824(n) = Sum_{i=1..n} i*10^(n-i) = (0, 1, 12, 123, 1234, 12345, ...)</code>.
 * @author Sean A. Irvine
 */
public class A277830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277830() {
    super(new long[] {-100, 220, -141, 22}, new long[] {1, 1, 2, 23});
  }
}
