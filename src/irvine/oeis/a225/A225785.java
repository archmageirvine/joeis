package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225785.
 * @author Sean A. Irvine
 */
public class A225785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225785() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {0, 12, 84, 3960, 27144});
  }
}
