package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063495.
 * @author Sean A. Irvine
 */
public class A063495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063495() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 18, 80, 217});
  }
}
