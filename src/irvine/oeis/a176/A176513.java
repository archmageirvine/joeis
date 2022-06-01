package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176513 a(n+5) = a(n+3) + a(n+2) + a(n), with a(1) = a(2) = a(3) = a(4) = a(5) = 1.
 * @author Sean A. Irvine
 */
public class A176513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176513() {
    super(new long[] {1, 0, 1, 1, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
