package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254653 Indices of centered heptagonal numbers <code>(A069099)</code> which are also pentagonal numbers <code>(A000326)</code>.
 * @author Sean A. Irvine
 */
public class A254653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254653() {
    super(new long[] {1, -1, -110, 110, 1}, new long[] {1, 3, 58, 276, 6325});
  }
}
