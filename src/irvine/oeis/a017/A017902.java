package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017902 Expansion of <code>1/(1 - x^8 - x^9 - ...)</code>.
 * @author Sean A. Irvine
 */
public class A017902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017902() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0});
  }
}
