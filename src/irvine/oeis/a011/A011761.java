package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011761.
 * @author Sean A. Irvine
 */
public class A011761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011761() {
    super(new long[] {1, 0, 1}, new long[] {1, 1, 5});
  }
}
