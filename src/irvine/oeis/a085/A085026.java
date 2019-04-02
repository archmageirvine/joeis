package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085026 a(n) = (6*n+1)*(6*n+7).
 * @author Sean A. Irvine
 */
public class A085026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085026() {
    super(new long[] {1, -3, 3}, new long[] {7, 91, 247});
  }
}
