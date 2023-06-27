package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145404 Number of perfect matchings (or domino tilings) in O_6 X P_n.
 * @author Sean A. Irvine
 */
public class A145404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145404() {
    super(1, new long[] {1, 12, -47, -8, 47, 12}, new long[] {8, 137, 2016, 30521, 459544, 6926545});
  }
}
