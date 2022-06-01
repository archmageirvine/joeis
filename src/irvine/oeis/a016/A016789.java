package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016789 a(n) = 3*n + 2.
 * @author Sean A. Irvine
 */
public class A016789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016789() {
    super(new long[] {-1, 2}, new long[] {2, 5});
  }
}
