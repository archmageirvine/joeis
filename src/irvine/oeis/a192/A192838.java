package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192838 Molecular topological indices of the prism graphs Y_n.
 * @author Sean A. Irvine
 */
public class A192838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192838() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {24, 84, 180, 360, 600, 972});
  }
}
