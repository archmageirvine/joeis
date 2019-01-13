package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212746.
 * @author Sean A. Irvine
 */
public class A212746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212746() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 15, 79, 225, 529, 975, 1711});
  }
}
