package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111567 Binomial transform of A048654: generalized Pellian with second term equal to 4.
 * @author Sean A. Irvine
 */
public class A111567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111567() {
    super(new long[] {-2, 4}, new long[] {1, 5});
  }
}
