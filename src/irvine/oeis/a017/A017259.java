package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017259 <code>a(n) = (9*n + 8)^3</code>.
 * @author Sean A. Irvine
 */
public class A017259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017259() {
    super(new long[] {-1, 4, -6, 4}, new long[] {512, 4913, 17576, 42875});
  }
}
