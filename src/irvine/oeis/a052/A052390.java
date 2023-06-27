package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052390 Number of 4-element intersecting families (with not necessarily distinct sets) whose union is an n-element set.
 * @author Sean A. Irvine
 */
public class A052390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052390() {
    super(1, new long[] {59875200, -178819920, 220549356, -150923976, 64427005, -18166175, 3473673, -452523, 39495, -2205, 71}, new long[] {1, 7, 71, 956, 15116, 254397, 4318511, 72331966, 1188180386, 19152566087L, 303768582701L});
  }
}
