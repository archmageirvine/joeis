package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017643 a(n) = (12n+10)^3.
 * @author Sean A. Irvine
 */
public class A017643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017643() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1000, 10648, 39304, 97336});
  }
}
