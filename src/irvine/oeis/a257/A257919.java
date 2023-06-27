package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257919 The number of combinatorial equivalence classes of n-endomorphisms on a rank-3 semigroup.
 * @author Sean A. Irvine
 */
public class A257919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257919() {
    super(1, new long[] {-2187, 6156, -6219, 2760, -553, 44}, new long[] {7, 304, 9958, 288280, 7973053, 217032088});
  }
}
