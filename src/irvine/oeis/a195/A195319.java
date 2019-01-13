package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195319.
 * @author Sean A. Irvine
 */
public class A195319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195319() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 30});
  }
}
