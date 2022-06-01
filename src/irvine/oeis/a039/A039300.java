package irvine.oeis.a039;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A039300 Number of distinct quadratic residues mod 3^n.
 * @author Sean A. Irvine
 */
public class A039300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039300() {
    super(new long[] {-3, 1, 3}, new long[] {1, 2, 4});
  }
}
