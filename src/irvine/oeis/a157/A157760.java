package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157760.
 * @author Sean A. Irvine
 */
public class A157760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157760() {
    super(new long[] {1, -3, 3}, new long[] {1898, 9325, 22370});
  }
}
