package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017137 a(n) = 8*n+6.
 * @author Sean A. Irvine
 */
public class A017137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017137() {
    super(new long[] {-1, 2}, new long[] {6, 14});
  }
}
