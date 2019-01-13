package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132458.
 * @author Sean A. Irvine
 */
public class A132458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132458() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 0, 1, 24, 200, 1000, 3675});
  }
}
