package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066406 a(n) = 2^n*(3^n-3).
 * @author Sean A. Irvine
 */
public class A066406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066406() {
    super(new long[] {-12, 8}, new long[] {0, 24});
  }
}
