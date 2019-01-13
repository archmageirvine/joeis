package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228920.
 * @author Sean A. Irvine
 */
public class A228920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228920() {
    super(new long[] {32, -24, 8}, new long[] {2, 4, 8});
  }
}
