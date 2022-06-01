package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085036 a(n) = (5*n+2)*(5*n+7).
 * @author Sean A. Irvine
 */
public class A085036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085036() {
    super(new long[] {1, -3, 3}, new long[] {14, 84, 204});
  }
}
