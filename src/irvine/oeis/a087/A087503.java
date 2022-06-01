package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087503 a(n) = 3(a(n-2) + 1), with a(0) = 1, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A087503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087503() {
    super(new long[] {-3, 3, 1}, new long[] {1, 3, 6});
  }
}
