package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119332 Expansion of <code>(1+x)/(1-2x^4)</code>.
 * @author Sean A. Irvine
 */
public class A119332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119332() {
    super(new long[] {2, 0, 0, 0}, new long[] {1, 1, 0, 0});
  }
}
