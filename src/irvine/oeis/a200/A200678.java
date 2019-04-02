package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200678 Partial sums of A200675.
 * @author Sean A. Irvine
 */
public class A200678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200678() {
    super(new long[] {-2, 2, 0, 0, 1}, new long[] {1, 2, 3, 4, 6});
  }
}
