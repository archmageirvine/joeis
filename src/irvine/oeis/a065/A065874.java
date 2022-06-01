package irvine.oeis.a065;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A065874 a(n) = (7^(n+1) - (-6)^(n+1))/13.
 * @author Sean A. Irvine
 */
public class A065874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065874() {
    super(new long[] {42, 1}, new long[] {1, 1});
  }
}
