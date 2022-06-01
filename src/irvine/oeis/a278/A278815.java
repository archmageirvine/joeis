package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278815 Number of tilings of a 2 X n grid with monomers, dimers, and trimers.
 * @author Sean A. Irvine
 */
public class A278815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278815() {
    super(new long[] {-1, 0, -2, 5, 2, 3}, new long[] {1, 2, 7, 29, 109, 416});
  }
}
