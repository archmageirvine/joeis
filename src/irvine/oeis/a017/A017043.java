package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017043 <code>a(n) = (7*n + 5)^3</code>.
 * @author Sean A. Irvine
 */
public class A017043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017043() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 1728, 6859, 17576});
  }
}
