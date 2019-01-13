package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131082.
 * @author Sean A. Irvine
 */
public class A131082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131082() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {15, 11, 5, 1, 1});
  }
}
