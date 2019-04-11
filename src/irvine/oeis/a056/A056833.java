package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056833 Nearest integer to <code>n^2/7</code>.
 * @author Sean A. Irvine
 */
public class A056833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056833() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 1, 2, 4, 5, 7, 9});
  }
}
