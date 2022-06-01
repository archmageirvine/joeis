package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028083 Expansion of 1/((1-3x)(1-6x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028083() {
    super(new long[] {-1620, 1152, -279, 28}, new long[] {1, 28, 505, 7480});
  }
}
