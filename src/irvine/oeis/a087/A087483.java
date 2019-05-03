package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087483 Row 0 of the order array of 3/2, i.e., row 0 of the transposable dispersion in <code>A087465</code>.
 * @author Sean A. Irvine
 */
public class A087483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087483() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 4, 6, 9});
  }
}
