package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087483 Row 0 of the order array of <code>3/2, i</code>.e., row 0 of the transposable dispersion in A087465.
 * @author Sean A. Irvine
 */
public class A087483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087483() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 4, 6, 9});
  }
}
