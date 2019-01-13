package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136258.
 * @author Sean A. Irvine
 */
public class A136258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136258() {
    super(new long[] {-2, 2}, new long[] {1, 5});
  }
}
