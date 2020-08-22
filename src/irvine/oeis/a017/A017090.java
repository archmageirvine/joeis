package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017090 a(n) = (8*n + 2)^2.
 * @author Sean A. Irvine
 */
public class A017090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017090() {
    super(new long[] {1, -3, 3}, new long[] {4, 100, 324});
  }
}
