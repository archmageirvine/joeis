package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157511.
 * @author Sean A. Irvine
 */
public class A157511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157511() {
    super(new long[] {1, -3, 3}, new long[] {5201, 20401, 45601});
  }
}
