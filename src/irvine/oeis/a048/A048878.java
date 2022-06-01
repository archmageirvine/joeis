package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048878 Generalized Pellian with second term of 9.
 * @author Sean A. Irvine
 */
public class A048878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048878() {
    super(new long[] {1, 4}, new long[] {1, 9});
  }
}
