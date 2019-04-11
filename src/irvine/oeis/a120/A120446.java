package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120446 Expansion of <code>1/(1-x-x^4-x^6)</code>.
 * @author Sean A. Irvine
 */
public class A120446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120446() {
    super(new long[] {1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3});
  }
}
