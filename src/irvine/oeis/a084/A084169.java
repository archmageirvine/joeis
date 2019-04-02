package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084169 A Pell Jacobsthal product.
 * @author Sean A. Irvine
 */
public class A084169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084169() {
    super(new long[] {-4, 4, 13, 2}, new long[] {0, 1, 2, 15});
  }
}
