package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046637 Number of cubic residues mod 9^n.
 * @author Sean A. Irvine
 */
public class A046637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046637() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 3, 21, 169});
  }
}
