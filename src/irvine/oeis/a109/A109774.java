package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109774 a(n) = (3^(n-1) - 1) * (3^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A109774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109774() {
    super(new long[] {27, -39, 13}, new long[] {0, 8, 104});
  }
}
