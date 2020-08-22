package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033516 Number of matchings in graph C_{4} X P_{n}.
 * @author Sean A. Irvine
 */
public class A033516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033516() {
    super(new long[] {-1, 2, 18, -46, 6, 14}, new long[] {1, 7, 108, 1511, 21497, 305184});
  }
}
