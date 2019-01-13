package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065506.
 * @author Sean A. Irvine
 */
public class A065506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065506() {
    super(new long[] {-2, -5, 3, 2}, new long[] {1, 2, 7, 15});
  }
}
