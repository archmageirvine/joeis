package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248924 Sequence derived from arithmetic relations between powers of phi (A001622): a(n) = phi^n - (-1)^n * (n - phi^-n).
 * @author Sean A. Irvine
 */
public class A248924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248924() {
    super(new long[] {1, 3, 2, -1}, new long[] {2, 2, 1, 7});
  }
}
