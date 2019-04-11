package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147589 Concatenation of <code>2n-1</code> digits 1 and <code>n-1</code> digits 0.
 * @author Sean A. Irvine
 */
public class A147589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147589() {
    super(new long[] {-10000, 1010}, new long[] {1, 1110});
  }
}
