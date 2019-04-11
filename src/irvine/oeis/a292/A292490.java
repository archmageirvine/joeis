package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292490 p-INVERT of the odd positive integers, where p(S) <code>= 1 -</code> S <code>- 7</code> S^2.
 * @author Sean A. Irvine
 */
public class A292490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292490() {
    super(new long[] {7, 17, 0, 5}, new long[] {1, 11, 68, 365});
  }
}
