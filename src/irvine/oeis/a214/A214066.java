package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214066 a(n) = floor( (3/2)*floor(5*n/2) ).
 * @author Sean A. Irvine
 */
public class A214066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214066() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 7, 10, 15});
  }
}
