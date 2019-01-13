package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251654.
 * @author Sean A. Irvine
 */
public class A251654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251654() {
    super(new long[] {1, 1, 1, 1}, new long[] {0, 1, 1, 0});
  }
}
