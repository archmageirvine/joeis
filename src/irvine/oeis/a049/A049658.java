package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049658.
 * @author Sean A. Irvine
 */
public class A049658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049658() {
    super(new long[] {1, -48, 48}, new long[] {1, 77, 3648});
  }
}
