package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245829.
 * @author Sean A. Irvine
 */
public class A245829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245829() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {51, 192, 285, 648, 847, 1536, 1881});
  }
}
