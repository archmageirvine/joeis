package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050228.
 * @author Sean A. Irvine
 */
public class A050228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050228() {
    super(new long[] {1, -2, 2, -3, 3}, new long[] {1, 3, 6, 11, 19});
  }
}
