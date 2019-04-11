package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017331 <code>a(n) = (10*n + 5)^3</code>.
 * @author Sean A. Irvine
 */
public class A017331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017331() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 3375, 15625, 42875});
  }
}
