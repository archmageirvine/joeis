package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022110 Fibonacci sequence beginning <code>1, 20</code>.
 * @author Sean A. Irvine
 */
public class A022110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022110() {
    super(new long[] {1, 1}, new long[] {1, 20});
  }
}
