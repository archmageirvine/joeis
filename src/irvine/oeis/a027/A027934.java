package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027934.
 * @author Sean A. Irvine
 */
public class A027934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027934() {
    super(new long[] {-2, -1, 3}, new long[] {0, 1, 2});
  }
}
