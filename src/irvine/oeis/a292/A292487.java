package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292487 p-INVERT of the odd positive integers, where p(S) <code>= 1 -</code> S <code>- 4</code> S^2.
 * @author Sean A. Irvine
 */
public class A292487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292487() {
    super(new long[] {4, 11, -3, 5}, new long[] {1, 8, 44, 212});
  }
}
