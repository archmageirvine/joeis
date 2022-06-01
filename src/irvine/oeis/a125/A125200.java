package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125200 n*(4*n^2 + n -1)/2.
 * @author Sean A. Irvine
 */
public class A125200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125200() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 17, 57, 134});
  }
}
