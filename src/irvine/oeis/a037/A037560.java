package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037560.
 * @author Sean A. Irvine
 */
public class A037560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037560() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 8, 25, 77});
  }
}
