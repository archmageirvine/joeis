package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192807.
 * @author Sean A. Irvine
 */
public class A192807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192807() {
    super(new long[] {1, -5, 7}, new long[] {0, 1, 6});
  }
}
