package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226308.
 * @author Sean A. Irvine
 */
public class A226308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226308() {
    super(new long[] {2, 1, 1}, new long[] {2, 1, 5});
  }
}
