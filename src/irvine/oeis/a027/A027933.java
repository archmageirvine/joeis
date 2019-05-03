package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027933 <code>a(n) = T(n, 2*n-10)</code>, T given by <code>A027926</code>.
 * @author Sean A. Irvine
 */
public class A027933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027933() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 2, 5, 13, 34, 89, 232, 596, 1490, 3588, 8273});
  }
}
