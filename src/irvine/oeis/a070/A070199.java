package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070199 Number of palindromes of length <code>&lt;=</code> n.
 * @author Sean A. Irvine
 */
public class A070199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070199() {
    super(new long[] {-10, 10, 1}, new long[] {10, 19, 109});
  }
}
