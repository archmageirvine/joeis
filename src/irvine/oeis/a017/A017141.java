package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017141 <code>a(n) = (8*n+6)^5</code>.
 * @author Sean A. Irvine
 */
public class A017141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017141() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7776, 537824, 5153632, 24300000, 79235168, 205962976});
  }
}
