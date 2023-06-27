package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123188 a(n) = -5*a(n-1) + 8*a(n-2) + 6*a(n-3) - 4*a(n-4).
 * @author Sean A. Irvine
 */
public class A123188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123188() {
    super(1, new long[] {-4, 6, 8, -5}, new long[] {1, 0, 2, -8});
  }
}
