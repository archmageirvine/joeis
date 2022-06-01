package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144928 Values of k arising in A144927.
 * @author Sean A. Irvine
 */
public class A144928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144928() {
    super(new long[] {-1, 110}, new long[] {49, 5341});
  }
}
