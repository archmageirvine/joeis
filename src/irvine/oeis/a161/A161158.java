package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161158 a(n) = A003696(n+1)/A001353(n+1).
 * @author Sean A. Irvine
 */
public class A161158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161158() {
    super(new long[] {-1, 14, -34, 14}, new long[] {1, 14, 161, 1792});
  }
}
