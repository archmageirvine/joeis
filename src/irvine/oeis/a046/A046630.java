package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046630 Number of cubic residues mod 2^n.
 * @author Sean A. Irvine
 */
public class A046630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046630() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 2, 3, 5});
  }
}
