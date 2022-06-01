package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123656 a(n) = 1 + n^4 + n^6.
 * @author Sean A. Irvine
 */
public class A123656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123656() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {3, 81, 811, 4353, 16251, 47953, 120051});
  }
}
