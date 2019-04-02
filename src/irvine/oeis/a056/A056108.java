package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056108 Fourth spoke of a hexagonal spiral.
 * @author Sean A. Irvine
 */
public class A056108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056108() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 15});
  }
}
