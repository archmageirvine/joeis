package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176372 y-values in the solution to <code>x^2-66*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A176372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176372() {
    super(new long[] {-1, 130}, new long[] {0, 8});
  }
}
