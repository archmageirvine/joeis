package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225484.
 * @author Sean A. Irvine
 */
public class A225484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225484() {
    super(new long[] {-1, 0, 0, 1, 1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 1, 2, 2, 3});
  }
}
