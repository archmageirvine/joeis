package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097870.
 * @author Sean A. Irvine
 */
public class A097870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097870() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 2, 4, 10, 17, 27, 45, 66});
  }
}
