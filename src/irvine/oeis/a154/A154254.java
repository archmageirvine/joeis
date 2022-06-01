package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154254 a(n) = 9n^2 - 8n + 2.
 * @author Sean A. Irvine
 */
public class A154254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154254() {
    super(new long[] {1, -3, 3}, new long[] {2, 3, 22});
  }
}
