package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195315 Centered 32-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195315() {
    super(new long[] {1, -3, 3}, new long[] {1, 33, 97});
  }
}
