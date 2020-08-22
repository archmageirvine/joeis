package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070376 a(n) = 5^n mod 26.
 * @author Sean A. Irvine
 */
public class A070376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070376() {
    super(new long[] {1, -1, 1}, new long[] {1, 5, 25});
  }
}
