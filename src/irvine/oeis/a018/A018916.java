package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018916.
 * @author Sean A. Irvine
 */
public class A018916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018916() {
    super(new long[] {-2, 0, 4}, new long[] {2, 8, 31});
  }
}
