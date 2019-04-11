package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017449 <code>a(n) = 11*n + 5</code>.
 * @author Sean A. Irvine
 */
public class A017449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017449() {
    super(new long[] {-1, 2}, new long[] {5, 16});
  }
}
