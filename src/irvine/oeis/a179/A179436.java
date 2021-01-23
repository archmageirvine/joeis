package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179436 a(n) = (3*n+7)*(3*n+2)/2.
 * @author Sean A. Irvine
 */
public class A179436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179436() {
    super(new long[] {1, -3, 3}, new long[] {7, 25, 52});
  }
}
