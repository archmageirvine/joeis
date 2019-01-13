package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041687.
 * @author Sean A. Irvine
 */
public class A041687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041687() {
    super(new long[] {-1, 0, 724, 0}, new long[] {1, 19, 723, 13756});
  }
}
