package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032125 "BIK" (reversible, indistinct, unlabeled) transform of <code>3,3,3,3..</code>.
 * @author Sean A. Irvine
 */
public class A032125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032125() {
    super(new long[] {-8, 6}, new long[] {3, 9});
  }
}
