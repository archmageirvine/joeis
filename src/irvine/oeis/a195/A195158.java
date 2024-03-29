package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195158 Concentric 24-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195158() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 24, 49});
  }
}
