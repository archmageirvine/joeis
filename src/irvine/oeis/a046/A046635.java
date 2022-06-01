package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046635 Number of cubic residues mod 7^n.
 * @author Sean A. Irvine
 */
public class A046635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046635() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 3, 15, 99});
  }
}
