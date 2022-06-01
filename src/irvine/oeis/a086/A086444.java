package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086444 Sequence associated with palindromic structures.
 * @author Sean A. Irvine
 */
public class A086444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086444() {
    super(new long[] {30, -31, 10}, new long[] {1, 3, 10});
  }
}
