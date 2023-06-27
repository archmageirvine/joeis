package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192797 Molecular topological indices of the cycle graphs.
 * @author Sean A. Irvine
 */
public class A192797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192797() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {4, 12, 24, 48, 80, 132});
  }
}
