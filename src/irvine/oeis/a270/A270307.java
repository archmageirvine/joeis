package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270307.
 * @author Sean A. Irvine
 */
public class A270307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270307() {
    super(new long[] {2, 4, 2, -1}, new long[] {1, 3, 7, 7});
  }
}
