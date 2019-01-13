package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220639.
 * @author Sean A. Irvine
 */
public class A220639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220639() {
    super(new long[] {-3, 10, -16, -20, 22, 8}, new long[] {1, 3, 40, 369, 3755, 37320});
  }
}
