package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157923.
 * @author Sean A. Irvine
 */
public class A157923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157923() {
    super(new long[] {1, -3, 3}, new long[] {48, 194, 438});
  }
}
