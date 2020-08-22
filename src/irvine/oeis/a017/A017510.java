package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017510 a(n) = (11*n + 10)^2.
 * @author Sean A. Irvine
 */
public class A017510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017510() {
    super(new long[] {1, -3, 3}, new long[] {100, 441, 1024});
  }
}
