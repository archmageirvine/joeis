package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081628.
 * @author Sean A. Irvine
 */
public class A081628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081628() {
    super(new long[] {-5, -6}, new long[] {1, 3});
  }
}
