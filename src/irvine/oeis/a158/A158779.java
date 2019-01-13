package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158779.
 * @author Sean A. Irvine
 */
public class A158779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158779() {
    super(new long[] {6561, 0, 0, 1}, new long[] {1, 9, 81, 729});
  }
}
