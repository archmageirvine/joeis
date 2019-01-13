package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167467.
 * @author Sean A. Irvine
 */
public class A167467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167467() {
    super(new long[] {-1, 4, -6, 4}, new long[] {23, 190, 652, 1559});
  }
}
