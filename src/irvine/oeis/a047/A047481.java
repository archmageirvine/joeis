package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047481.
 * @author Sean A. Irvine
 */
public class A047481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047481() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 2, 5, 7});
  }
}
