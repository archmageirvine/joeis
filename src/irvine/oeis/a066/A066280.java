package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066280 a(n) = 1^n + 2^(n+1) + 3^(n+2).
 * @author Sean A. Irvine
 */
public class A066280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066280() {
    super(-1, new long[] {6, -11, 6}, new long[] {5, 12, 32});
  }
}
