package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147537 Numbers whose binary representation is the concatenation of 2n-1 digits 1 and n digits 0.
 * @author Sean A. Irvine
 */
public class A147537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147537() {
    super(new long[] {-16, 10}, new long[] {2, 28});
  }
}
