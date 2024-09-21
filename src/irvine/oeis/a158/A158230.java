package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158230 a(n) = 256*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158230() {
    super(1, new long[] {1, -3, 3}, new long[] {258, 1028, 2310});
  }
}
