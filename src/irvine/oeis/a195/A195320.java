package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195320.
 * @author Sean A. Irvine
 */
public class A195320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195320() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 42});
  }
}
