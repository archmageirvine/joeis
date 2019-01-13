package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027620.
 * @author Sean A. Irvine
 */
public class A027620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027620() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 32, 75, 144});
  }
}
