package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028157.
 * @author Sean A. Irvine
 */
public class A028157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028157() {
    super(new long[] {-3456, 1968, -392, 33}, new long[] {1, 33, 697, 12033});
  }
}
