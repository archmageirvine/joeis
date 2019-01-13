package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240134.
 * @author Sean A. Irvine
 */
public class A240134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240134() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 4, 3, 12, 5});
  }
}
