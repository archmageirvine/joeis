package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131531.
 * @author Sean A. Irvine
 */
public class A131531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131531() {
    super(new long[] {-1, 0, 0}, new long[] {0, 0, 1});
  }
}
