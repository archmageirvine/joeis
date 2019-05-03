package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153875 3 times <code>13-gonal</code> (or tridecagonal) numbers: <code>3*n*(11*n - 9)/2</code>.
 * @author Sean A. Irvine
 */
public class A153875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153875() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 39});
  }
}
