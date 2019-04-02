package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277752 a(n) = Sum_{k=0..n} (-1)^k*floor(phi^k), where phi is the golden ratio (A001622).
 * @author Sean A. Irvine
 */
public class A277752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277752() {
    super(new long[] {1, -2, -1, 3, 0}, new long[] {1, 0, 2, -2, 4});
  }
}
