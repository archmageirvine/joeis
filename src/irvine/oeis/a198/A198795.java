package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198795.
 * @author Sean A. Irvine
 */
public class A198795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198795() {
    super(new long[] {-6, 7}, new long[] {6, 41});
  }
}
