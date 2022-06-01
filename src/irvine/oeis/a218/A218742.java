package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218742 a(n) = (39^n-1)/38.
 * @author Sean A. Irvine
 */
public class A218742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218742() {
    super(new long[] {-39, 40}, new long[] {0, 1});
  }
}
