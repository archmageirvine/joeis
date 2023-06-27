package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291894 Number of symmetrically unique Dyck paths of semilength n and height ten.
 * @author Sean A. Irvine
 */
public class A291894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291894() {
    super(10, new long[] {-12, 286, -2242, 7199, -4672, -29145, 74434, -40683, -84808, 146758, -52648, -66056, 75036, -16958, -16162, 12511, -2412, -932, 650, -163, 20}, new long[] {1, 10, 109, 857, 5915, 36063, 202712, 1066920, 5342964, 25702079, 119712521, 542946033, 2408776681L, 10490222605L, 44973252446L, 190237502710L, 795469360671L, 3293109382032L, 13514583025521L, 55040336697141L, 222657353371499L});
  }
}
