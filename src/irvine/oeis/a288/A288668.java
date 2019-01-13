package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288668.
 * @author Sean A. Irvine
 */
public class A288668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288668() {
    super(new long[] {2, 1, 0}, new long[] {2, 4, 5});
  }
}
