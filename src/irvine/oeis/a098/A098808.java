package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098808 a(n) = 2^(n + 11) - 11.
 * @author Sean A. Irvine
 */
public class A098808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098808() {
    super(new long[] {-2, 3}, new long[] {2037, 4085});
  }
}
