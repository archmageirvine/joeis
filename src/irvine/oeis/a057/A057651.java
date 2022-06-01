package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057651 a(n) = (3 * 5^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A057651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057651() {
    super(new long[] {-5, 6}, new long[] {1, 7});
  }
}
