package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121496 Run lengths of successive numbers in A068225.
 * @author Sean A. Irvine
 */
public class A121496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121496() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 2, 1, 3});
  }
}
