package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277975.
 * @author Sean A. Irvine
 */
public class A277975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277975() {
    super(new long[] {25, -35, 11}, new long[] {1, 6, 56});
  }
}
