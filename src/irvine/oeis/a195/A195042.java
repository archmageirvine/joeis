package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195042 Concentric 9-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195042() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 9, 19});
  }
}
