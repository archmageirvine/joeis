package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190153 Row sums of the triangle A190152.
 * @author Sean A. Irvine
 */
public class A190153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190153() {
    super(new long[] {1, 2, 5}, new long[] {1, 2, 12});
  }
}
