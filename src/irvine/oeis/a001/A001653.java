package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001653.
 * @author Sean A. Irvine
 */
public class A001653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001653() {
    super(new long[] {-1, 6}, new long[] {1, 5});
  }
}
