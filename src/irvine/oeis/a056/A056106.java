package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056106 Second spoke of a hexagonal spiral.
 * @author Sean A. Irvine
 */
public class A056106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056106() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 11});
  }
}
