package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048697 Generalized Pellian with second term equal to 10.
 * @author Sean A. Irvine
 */
public class A048697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048697() {
    super(new long[] {1, 2}, new long[] {1, 10});
  }
}
