package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227138.
 * @author Sean A. Irvine
 */
public class A227138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227138() {
    super(new long[] {-1, 1000002}, new long[] {1, 1000001});
  }
}
