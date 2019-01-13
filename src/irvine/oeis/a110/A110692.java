package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110692.
 * @author Sean A. Irvine
 */
public class A110692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110692() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 29, 275, 1498, 5846, 18250, 48546, 114480});
  }
}
