package irvine.oeis.a039;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A039306 Number of distinct quadratic residues mod 9^n.
 * @author Sean A. Irvine
 */
public class A039306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039306() {
    super(new long[] {-9, 10}, new long[] {1, 4});
  }
}
