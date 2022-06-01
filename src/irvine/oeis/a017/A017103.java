package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017103 a(n) = (8*n+3)^3.
 * @author Sean A. Irvine
 */
public class A017103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017103() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 1331, 6859, 19683});
  }
}
