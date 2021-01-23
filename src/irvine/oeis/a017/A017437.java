package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017437 a(n) = 11*n + 4.
 * @author Sean A. Irvine
 */
public class A017437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017437() {
    super(new long[] {-1, 2}, new long[] {4, 15});
  }
}
