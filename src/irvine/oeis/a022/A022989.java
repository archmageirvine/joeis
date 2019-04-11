package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022989 <code>33-n</code>.
 * @author Sean A. Irvine
 */
public class A022989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022989() {
    super(new long[] {-1, 2}, new long[] {33, 32});
  }
}
