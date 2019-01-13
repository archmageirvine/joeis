package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226205.
 * @author Sean A. Irvine
 */
public class A226205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226205() {
    super(new long[] {-1, 2, 2}, new long[] {1, 0, 3});
  }
}
