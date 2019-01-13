package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028860.
 * @author Sean A. Irvine
 */
public class A028860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028860() {
    super(new long[] {2, 2}, new long[] {-1, 1});
  }
}
