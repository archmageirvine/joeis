package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291938 a(n) = 2^(n - 1) (n - mod(n, 2)).
 * @author Sean A. Irvine
 */
public class A291938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291938() {
    super(new long[] {-8, 4, 2}, new long[] {0, 4, 8});
  }
}
