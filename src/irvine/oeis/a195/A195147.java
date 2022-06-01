package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195147 Concentric 18-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195147() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 18, 37});
  }
}
