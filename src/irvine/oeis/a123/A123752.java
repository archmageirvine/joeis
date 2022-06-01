package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123752 a(n) = 7*a(n-2), a(0) = 1, a(1) = 2.
 * @author Sean A. Irvine
 */
public class A123752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123752() {
    super(new long[] {7, 0}, new long[] {1, 2});
  }
}
