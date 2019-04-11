package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017199 <code>a(n) = (9*n + 3)^3</code>.
 * @author Sean A. Irvine
 */
public class A017199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017199() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 1728, 9261, 27000});
  }
}
