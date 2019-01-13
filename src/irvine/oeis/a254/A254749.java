package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254749.
 * @author Sean A. Irvine
 */
public class A254749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254749() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 2, 0});
  }
}
