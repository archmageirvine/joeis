package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140824.
 * @author Sean A. Irvine
 */
public class A140824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140824() {
    super(new long[] {-1, 3, -2, 3}, new long[] {0, 1, 3, 6});
  }
}
