package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055437.
 * @author Sean A. Irvine
 */
public class A055437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055437() {
    super(new long[] {1, -3, 3}, new long[] {11, 42, 93});
  }
}
