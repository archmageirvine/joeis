package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016875 (5n+2)^3.
 * @author Sean A. Irvine
 */
public class A016875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016875() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 343, 1728, 4913});
  }
}
