package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195146 Concentric 16-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195146() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 16, 33});
  }
}
