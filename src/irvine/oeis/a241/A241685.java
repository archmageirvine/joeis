package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241685.
 * @author Sean A. Irvine
 */
public class A241685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241685() {
    super(new long[] {16, -4, -20, 5, 4}, new long[] {0, 2, 4, 18, 60});
  }
}
