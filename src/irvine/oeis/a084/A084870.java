package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084870.
 * @author Sean A. Irvine
 */
public class A084870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084870() {
    super(new long[] {-5760, 9072, -5684, 1820, -315, 28}, new long[] {1, 2, 6, 28, 190, 1692});
  }
}
