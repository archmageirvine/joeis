package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172316 7th column of the array <code>A172119</code>.
 * @author Sean A. Irvine
 */
public class A172316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172316() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64});
  }
}
