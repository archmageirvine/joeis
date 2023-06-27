package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158367 529n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A158367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158367() {
    super(1, new long[] {1, -3, 3}, new long[] {531, 2120, 4767});
  }
}
