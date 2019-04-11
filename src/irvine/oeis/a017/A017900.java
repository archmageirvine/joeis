package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017900 Expansion of <code>1/(1 -x^6 -x^7 -x^8 - ...)</code>.
 * @author Sean A. Irvine
 */
public class A017900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017900() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0});
  }
}
