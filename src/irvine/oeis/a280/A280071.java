package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280071.
 * @author Sean A. Irvine
 */
public class A280071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280071() {
    super(new long[] {1, -21, 21}, new long[] {1, 12, 232});
  }
}
