package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126642.
 * @author Sean A. Irvine
 */
public class A126642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126642() {
    super(new long[] {-24, 50, -35, 10}, new long[] {5, 25, 125, 601});
  }
}
