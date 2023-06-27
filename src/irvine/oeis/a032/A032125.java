package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032125 "BIK" (reversible, indistinct, unlabeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032125() {
    super(1, new long[] {-8, 6}, new long[] {3, 9});
  }
}
