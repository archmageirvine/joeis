package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190996 Fibonacci sequence beginning 10, 7.
 * @author Sean A. Irvine
 */
public class A190996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190996() {
    super(new long[] {1, 1}, new long[] {10, 7});
  }
}
