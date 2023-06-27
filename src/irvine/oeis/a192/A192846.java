package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192846 Molecular topological indices of the sunlet graphs.
 * @author Sean A. Irvine
 */
public class A192846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192846() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {14, 56, 126, 256, 430, 696});
  }
}
