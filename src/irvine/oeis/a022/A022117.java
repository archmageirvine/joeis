package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022117 Fibonacci sequence beginning <code>2, 15</code>.
 * @author Sean A. Irvine
 */
public class A022117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022117() {
    super(new long[] {1, 1}, new long[] {2, 15});
  }
}
