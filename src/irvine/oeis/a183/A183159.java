package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183159.
 * @author Sean A. Irvine
 */
public class A183159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183159() {
    super(new long[] {-4, 12, -11, 1, 3}, new long[] {1, 1, 4, 12, 38});
  }
}
