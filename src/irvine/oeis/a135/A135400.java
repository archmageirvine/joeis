package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135400 a(n) = (4*n^4 - 4*n^3 - n^2 + 3*n)/2.
 * @author Sean A. Irvine
 */
public class A135400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135400() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 17, 108, 382, 995});
  }
}
