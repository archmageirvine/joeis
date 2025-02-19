package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023455 a(n) = n - 13.
 * @author Sean A. Irvine
 */
public class A023455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023455() {
    super(new long[] {-1, 2}, new long[] {-13, -12});
  }
}
