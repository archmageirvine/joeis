package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169724 (2*3^(n-1)+1)^2.
 * @author Sean A. Irvine
 */
public class A169724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169724() {
    super(new long[] {27, -39, 13}, new long[] {9, 49, 361});
  }
}
