package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085027 a(n) = (4*n+3)*(4*n+7).
 * @author Sean A. Irvine
 */
public class A085027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085027() {
    super(new long[] {1, -3, 3}, new long[] {21, 77, 165});
  }
}
