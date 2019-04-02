package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135138 a(n) = 5*a(n-2) + 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A135138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135138() {
    super(new long[] {2, 5, 0}, new long[] {0, 0, 1});
  }
}
