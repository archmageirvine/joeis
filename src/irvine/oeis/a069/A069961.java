package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069961.
 * @author Sean A. Irvine
 */
public class A069961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069961() {
    super(new long[] {-1, 2, 2}, new long[] {1, 17, 20});
  }
}
