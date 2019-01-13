package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029826.
 * @author Sean A. Irvine
 */
public class A029826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029826() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 1, 0, -1}, new long[] {1, -1, 1, 0, 0, 1, 0, 1, 0, 1});
  }
}
