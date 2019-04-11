package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017904 Expansion of <code>1/(1 - x^10 - x^11 - </code>...).
 * @author Sean A. Irvine
 */
public class A017904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017904() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
