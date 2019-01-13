package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104554.
 * @author Sean A. Irvine
 */
public class A104554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104554() {
    super(new long[] {1, -2, 0, 1}, new long[] {0, 1, 0, 0});
  }
}
