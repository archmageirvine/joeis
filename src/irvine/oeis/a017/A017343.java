package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017343 a(n) = (10*n + 6)^3.
 * @author Sean A. Irvine
 */
public class A017343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017343() {
    super(new long[] {-1, 4, -6, 4}, new long[] {216, 4096, 17576, 46656});
  }
}
