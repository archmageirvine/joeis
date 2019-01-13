package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037780.
 * @author Sean A. Irvine
 */
public class A037780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037780() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {3, 16, 82, 410, 2053});
  }
}
