package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291987.
 * @author Sean A. Irvine
 */
public class A291987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291987() {
    super(new long[] {-24, 24, 12, -4, -2, -10, 1, 1, 2, 1}, new long[] {1, 1, 3, 6, 14, 20, 45, 69, 135, 210});
  }
}
