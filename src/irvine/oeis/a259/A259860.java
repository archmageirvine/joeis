package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259860.
 * @author Sean A. Irvine
 */
public class A259860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259860() {
    super(new long[] {-1, 4, -8, 4}, new long[] {1, 5, 12, 12});
  }
}
