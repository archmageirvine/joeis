package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037235.
 * @author Sean A. Irvine
 */
public class A037235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037235() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 4, 13});
  }
}
