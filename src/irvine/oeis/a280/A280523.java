package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280523.
 * @author Sean A. Irvine
 */
public class A280523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280523() {
    super(new long[] {-1, 5, -8, 5}, new long[] {1, 3, 10, 30});
  }
}
