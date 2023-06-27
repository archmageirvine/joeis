package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192845 Molecular topological indices of the sun graphs.
 * @author Sean A. Irvine
 */
public class A192845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192845() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {4, 56, 180, 400});
  }
}
