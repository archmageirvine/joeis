package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069131 Centered 18-gonal numbers.
 * @author Sean A. Irvine
 */
public class A069131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069131() {
    super(new long[] {1, -3, 3}, new long[] {1, 19, 55});
  }
}
