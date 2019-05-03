package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022400 Fibonacci sequence beginning <code>1, 30</code>.
 * @author Sean A. Irvine
 */
public class A022400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022400() {
    super(new long[] {1, 1}, new long[] {1, 30});
  }
}
