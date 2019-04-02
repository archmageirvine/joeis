package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053565 a(n) = 2^(n-1)*(3*n-4).
 * @author Sean A. Irvine
 */
public class A053565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053565() {
    super(new long[] {-4, 4}, new long[] {-2, -1});
  }
}
