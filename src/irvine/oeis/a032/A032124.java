package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032124 "BIK" (reversible, indistinct, unlabeled) transform of <code>2,2,2,2</code>...
 * @author Sean A. Irvine
 */
public class A032124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032124() {
    super(new long[] {-9, 3, 3}, new long[] {2, 5, 12});
  }
}
