package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017909 Expansion of <code>1/(1 - x^15 - x^16 - </code>...).
 * @author Sean A. Irvine
 */
public class A017909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017909() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
