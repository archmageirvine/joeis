package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139700 Binomial transform of <code>[1, 30, 30, 30, ...]</code>.
 * @author Sean A. Irvine
 */
public class A139700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139700() {
    super(new long[] {-2, 3}, new long[] {1, 31});
  }
}
