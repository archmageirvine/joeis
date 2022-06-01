package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240876 Expansion of (1 + x)^11 / (1 - x)^12.
 * @author Sean A. Irvine
 */
public class A240876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240876() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 23, 265, 2047, 11969, 56695, 227305, 795455, 2485825, 7059735, 18474633, 45046719});
  }
}
