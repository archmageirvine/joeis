package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065100.
 * @author Sean A. Irvine
 */
public class A065100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065100() {
    super(new long[] {-1, 9}, new long[] {3, 27});
  }
}
