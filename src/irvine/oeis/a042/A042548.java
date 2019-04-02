package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042548 Numerators of continued fraction convergents to sqrt(803).
 * @author Sean A. Irvine
 */
public class A042548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042548() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 14452, 0, 0, 0, 0, 0}, new long[] {28, 57, 85, 2352, 2437, 7226, 407093, 821412, 1228505, 33991047, 35219552, 104430151});
  }
}
