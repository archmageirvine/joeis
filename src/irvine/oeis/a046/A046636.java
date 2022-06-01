package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046636 Number of cubic residues mod 8^n.
 * @author Sean A. Irvine
 */
public class A046636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046636() {
    super(new long[] {-8, 9}, new long[] {1, 5});
  }
}
