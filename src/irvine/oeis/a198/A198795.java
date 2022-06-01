package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198795 7*6^n-1.
 * @author Sean A. Irvine
 */
public class A198795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198795() {
    super(new long[] {-6, 7}, new long[] {6, 41});
  }
}
