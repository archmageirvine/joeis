package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017367 a(n) = (10*n + 8)^3.
 * @author Sean A. Irvine
 */
public class A017367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017367() {
    super(new long[] {-1, 4, -6, 4}, new long[] {512, 5832, 21952, 54872});
  }
}
