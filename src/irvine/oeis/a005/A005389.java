package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005389 Number of Hamiltonian circuits on 2n times 4 rectangle.
 * @author Sean A. Irvine
 */
public class A005389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005389() {
    super(new long[] {-1, 0, -10, 8}, new long[] {1, 6, 37, 236});
  }
}
