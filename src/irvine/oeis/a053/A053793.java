package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053793 n^2+n modulo 7.
 * @author Sean A. Irvine
 */
public class A053793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053793() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 2, 6, 5, 6, 2, 0});
  }
}
