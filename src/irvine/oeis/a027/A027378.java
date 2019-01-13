package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027378.
 * @author Sean A. Irvine
 */
public class A027378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027378() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 11, 23});
  }
}
