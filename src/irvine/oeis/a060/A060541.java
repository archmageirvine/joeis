package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060541 a(n) = binomial(4*n, 4).
 * @author Sean A. Irvine
 */
public class A060541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060541() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 70, 495, 1820, 4845});
  }
}
