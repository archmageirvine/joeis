package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022105 Fibonacci sequence beginning <code>1, 15</code>.
 * @author Sean A. Irvine
 */
public class A022105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022105() {
    super(new long[] {1, 1}, new long[] {1, 15});
  }
}
