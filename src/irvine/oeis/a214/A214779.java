package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214779.
 * @author Sean A. Irvine
 */
public class A214779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214779() {
    super(new long[] {-1, 3, 0}, new long[] {-1, 1, -4});
  }
}
