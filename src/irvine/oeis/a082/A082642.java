package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082642 Expansion of Molien series for 5-dimensional representation of dihedral group of order 10.
 * @author Sean A. Irvine
 */
public class A082642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082642() {
    super(new long[] {1, -1, -1, 1, 0, -1, 1, 1}, new long[] {1, 0, 1, 2, 3, 4, 5, 6});
  }
}
