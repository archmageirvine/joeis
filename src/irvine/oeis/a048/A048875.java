package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048875 Generalized Pellian with second term of 6.
 * @author Sean A. Irvine
 */
public class A048875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048875() {
    super(new long[] {1, 4}, new long[] {1, 6});
  }
}
