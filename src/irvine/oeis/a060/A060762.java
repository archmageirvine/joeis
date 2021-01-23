package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060762 Number of conjugacy classes (the same as the number of irreducible representations) in the dihedral group with 2n elements.
 * @author Sean A. Irvine
 */
public class A060762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060762() {
    super(new long[] {-1, 1, 1}, new long[] {2, 4, 3});
  }
}
