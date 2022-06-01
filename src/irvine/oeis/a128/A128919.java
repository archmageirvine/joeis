package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128919 Numbers simultaneously heptagonal and centered heptagonal.
 * @author Sean A. Irvine
 */
public class A128919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128919() {
    super(new long[] {1, -143, 143}, new long[] {1, 148, 21022});
  }
}
