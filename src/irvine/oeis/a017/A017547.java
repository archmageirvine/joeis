package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017547 <code>a(n) = (12n + 2)^3</code>.
 * @author Sean A. Irvine
 */
public class A017547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017547() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 2744, 17576, 54872});
  }
}
