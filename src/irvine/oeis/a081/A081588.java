package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081588.
 * @author Sean A. Irvine
 */
public class A081588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081588() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 16, 106, 396});
  }
}
