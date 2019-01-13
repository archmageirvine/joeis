package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027973.
 * @author Sean A. Irvine
 */
public class A027973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027973() {
    super(new long[] {-2, -1, 3}, new long[] {1, 4, 9});
  }
}
