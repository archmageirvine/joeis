package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251861.
 * @author Sean A. Irvine
 */
public class A251861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251861() {
    super(new long[] {-676, 26, 26}, new long[] {0, 650, 16900});
  }
}
