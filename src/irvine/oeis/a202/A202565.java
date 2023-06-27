package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202565 Indices of decagonal numbers which are also pentagonal.
 * @author Sean A. Irvine
 */
public class A202565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202565() {
    super(1, new long[] {1, -99, 99}, new long[] {1, 56, 5451});
  }
}
