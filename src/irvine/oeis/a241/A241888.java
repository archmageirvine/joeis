package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241888 a(n) = 2^(4*n + 1) - 1.
 * @author Sean A. Irvine
 */
public class A241888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241888() {
    super(new long[] {-16, 17}, new long[] {1, 31});
  }
}
