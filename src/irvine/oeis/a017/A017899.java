package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017899 Expansion of <code>1/(1 -x^5 -x^6 -x^7 - </code>...).
 * @author Sean A. Irvine
 */
public class A017899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017899() {
    super(new long[] {1, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0});
  }
}
