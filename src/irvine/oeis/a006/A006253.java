package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006253 Number of perfect matchings (or domino tilings) in C_4 X P_n.
 * @author Sean A. Irvine
 */
public class A006253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006253() {
    super(new long[] {0, -1, 3, 3}, new long[] {1, 2, 9, 32});
  }
}

