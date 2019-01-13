package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288380.
 * @author Sean A. Irvine
 */
public class A288380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288380() {
    super(new long[] {1, -3, 3, -3, 3}, new long[] {2, 4, 7, 11, 20});
  }
}
