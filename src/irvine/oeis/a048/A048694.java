package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048694 Generalized Pellian with second term equal to 7.
 * @author Sean A. Irvine
 */
public class A048694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048694() {
    super(new long[] {1, 2}, new long[] {1, 7});
  }
}
