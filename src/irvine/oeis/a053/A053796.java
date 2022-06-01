package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053796 a(n) = (n^2+n) modulo 5.
 * @author Sean A. Irvine
 */
public class A053796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053796() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 2, 1, 2, 0});
  }
}
