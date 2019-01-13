package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027990.
 * @author Sean A. Irvine
 */
public class A027990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027990() {
    super(new long[] {-1, 5, -5, -5, 5}, new long[] {1, 2, 7, 21, 65});
  }
}
