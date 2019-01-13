package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098849.
 * @author Sean A. Irvine
 */
public class A098849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098849() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 36});
  }
}
