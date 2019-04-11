package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090401 Expansion of <code>1/(1-3x+3x^4)</code>.
 * @author Sean A. Irvine
 */
public class A090401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090401() {
    super(new long[] {-3, 0, 0, 3}, new long[] {1, 3, 9, 27});
  }
}
