package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041439.
 * @author Sean A. Irvine
 */
public class A041439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041439() {
    super(new long[] {-1, 0, 92, 0}, new long[] {1, 3, 91, 276});
  }
}
