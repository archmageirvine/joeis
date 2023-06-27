package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168326 a(n) = (6*n - 3*(-1)^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A168326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168326() {
    super(1, new long[] {-1, 1, 1}, new long[] {4, 4, 10});
  }
}
