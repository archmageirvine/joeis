package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081108.
 * @author Sean A. Irvine
 */
public class A081108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081108() {
    super(new long[] {-64, 16}, new long[] {1, 9});
  }
}
