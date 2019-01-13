package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081916.
 * @author Sean A. Irvine
 */
public class A081916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081916() {
    super(new long[] {-625, 500, -150, 20}, new long[] {1, 5, 25, 126});
  }
}
