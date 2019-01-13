package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041064.
 * @author Sean A. Irvine
 */
public class A041064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041064() {
    super(new long[] {-1, 0, 50, 0}, new long[] {6, 25, 306, 1249});
  }
}
