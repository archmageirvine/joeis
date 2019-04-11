package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096979 Sum of the areas of the first <code>n+1</code> Pell triangles.
 * @author Sean A. Irvine
 */
public class A096979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096979() {
    super(new long[] {1, -6, 0, 6}, new long[] {0, 1, 6, 36});
  }
}
