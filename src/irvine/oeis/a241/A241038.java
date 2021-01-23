package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241038 A000217(A058481(n)).
 * @author Sean A. Irvine
 */
public class A241038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241038() {
    super(new long[] {27, -39, 13}, new long[] {0, 1, 28});
  }
}
