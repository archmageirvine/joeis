package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178885 Partial sums of Berstel sequence (A007420).
 * @author Sean A. Irvine
 */
public class A178885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178885() {
    super(new long[] {-4, 8, -6, 3}, new long[] {0, 0, 1, 3});
  }
}
