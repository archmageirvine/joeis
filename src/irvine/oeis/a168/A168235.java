package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168235 1+5*n+7*n^2.
 * @author Sean A. Irvine
 */
public class A168235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168235() {
    super(1, new long[] {1, -3, 3}, new long[] {13, 39, 79});
  }
}
