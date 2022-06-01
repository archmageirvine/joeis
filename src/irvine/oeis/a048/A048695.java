package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048695 Generalized Pellian with second term equal to 8.
 * @author Sean A. Irvine
 */
public class A048695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048695() {
    super(new long[] {1, 2}, new long[] {1, 8});
  }
}
