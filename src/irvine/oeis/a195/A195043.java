package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195043 Concentric 11-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195043() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 11, 23});
  }
}
