package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084175 Jacobsthal oblong numbers.
 * @author Sean A. Irvine
 */
public class A084175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084175() {
    super(new long[] {-8, 6, 3}, new long[] {0, 1, 3});
  }
}
