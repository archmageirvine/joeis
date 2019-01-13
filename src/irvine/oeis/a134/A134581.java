package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134581.
 * @author Sean A. Irvine
 */
public class A134581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134581() {
    super(new long[] {-3, 6, -7, 4}, new long[] {0, 1, 2, 3});
  }
}
