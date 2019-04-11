package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017475 <code>a(n) = (11*n + 7)^3</code>.
 * @author Sean A. Irvine
 */
public class A017475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017475() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 5832, 24389, 64000});
  }
}
