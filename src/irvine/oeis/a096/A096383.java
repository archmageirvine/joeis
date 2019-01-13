package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096383.
 * @author Sean A. Irvine
 */
public class A096383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096383() {
    super(new long[] {-1, 4, -6, 4}, new long[] {84, 240, 486, 840});
  }
}
