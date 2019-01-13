package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065423.
 * @author Sean A. Irvine
 */
public class A065423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065423() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 0, 2, 1});
  }
}
