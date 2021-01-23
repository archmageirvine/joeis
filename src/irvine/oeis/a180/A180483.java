package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180483 Solutions a(n) to (a(n)-2)*(a(n)-3) = 6*b(n)*(b(n)-1).
 * @author Sean A. Irvine
 */
public class A180483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180483() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {3, 6, 11, 38, 87});
  }
}
