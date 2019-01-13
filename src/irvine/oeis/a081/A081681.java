package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081681.
 * @author Sean A. Irvine
 */
public class A081681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081681() {
    super(new long[] {6720, -5944, 2070, -355, 30}, new long[] {1, 3, 9, 42, 399});
  }
}
