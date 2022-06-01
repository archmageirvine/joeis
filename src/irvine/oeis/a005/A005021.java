package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005021 Random walks (binomial transform of A006054).
 * @author Sean A. Irvine
 */
public class A005021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005021() {
    super(new long[] {1, -6, 5}, new long[] {1, 5, 19});
  }
}
