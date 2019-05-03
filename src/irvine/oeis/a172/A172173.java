package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172173 Sums of NE-SW diagonals of triangle <code>A172171</code>.
 * @author Sean A. Irvine
 */
public class A172173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172173() {
    super(new long[] {-1, -1, 2, 1}, new long[] {0, 1, 1, 11});
  }
}
