package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071270 <code>a(n) = n^2*(2*n^2+1)/3</code>.
 * @author Sean A. Irvine
 */
public class A071270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071270() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 12, 57, 176});
  }
}
