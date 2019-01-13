package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081074.
 * @author Sean A. Irvine
 */
public class A081074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081074() {
    super(new long[] {1, -8, 8}, new long[] {0, 18, 141});
  }
}
