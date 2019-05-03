package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032124 "BIK" <code>(reversible</code>, indistinct, unlabeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032124() {
    super(new long[] {-9, 3, 3}, new long[] {2, 5, 12});
  }
}
