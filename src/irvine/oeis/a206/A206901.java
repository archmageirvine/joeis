package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206901 Number of nonisomorphic graded posets with 0 of rank n with no 3-element antichain.
 * @author Sean A. Irvine
 */
public class A206901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206901() {
    super(new long[] {3, -10, 7}, new long[] {1, 2, 8});
  }
}
