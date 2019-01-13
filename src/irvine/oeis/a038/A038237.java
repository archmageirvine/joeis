package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038237.
 * @author Sean A. Irvine
 */
public class A038237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038237() {
    super(new long[] {-1, 0, 7, 0, -15, 0, 10, 0}, new long[] {1, 3, 7, 26, 56, 216, 462, 1791});
  }
}
