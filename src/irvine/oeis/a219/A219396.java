package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219396 Numbers k such that <code>19*k+1</code> is a square.
 * @author Sean A. Irvine
 */
public class A219396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219396() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 17, 21, 72, 80});
  }
}
