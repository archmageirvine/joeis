package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028724 <code>a(n) = (1/2)*floor(n/2)*floor((n-1)/2)*floor((n-2)/2)</code>.
 * @author Sean A. Irvine
 */
public class A028724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028724() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 0, 0, 1, 2, 6});
  }
}
