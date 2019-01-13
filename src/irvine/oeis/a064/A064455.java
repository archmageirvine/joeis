package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064455.
 * @author Sean A. Irvine
 */
public class A064455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064455() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 3, 2, 6});
  }
}
