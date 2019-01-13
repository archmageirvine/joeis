package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288961.
 * @author Sean A. Irvine
 */
public class A288961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288961() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 6, 32, 100});
  }
}
