package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017131 <code>a(n) = (8*n + 5)^7</code>.
 * @author Sean A. Irvine
 */
public class A017131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017131() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {78125, 62748517, 1801088541, 17249876309L, 94931877133L, 373669453125L, 1174711139837L, 3142742836021L});
  }
}
