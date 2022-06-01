package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192836 Molecular topological indices of the pan graphs.
 * @author Sean A. Irvine
 */
public class A192836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192836() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {14, 29, 48, 83, 126, 193});
  }
}
