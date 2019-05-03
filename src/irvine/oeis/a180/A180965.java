package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180965 Number of tatami tilings of a <code>2 X n</code> grid (with monomers allowed).
 * @author Sean A. Irvine
 */
public class A180965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180965() {
    super(new long[] {-1, 2, 0, 2}, new long[] {1, 2, 6, 13});
  }
}
