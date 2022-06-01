package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187541 a(4n+2) = 2n+1, otherwise a(n) = 4n.
 * @author Sean A. Irvine
 */
public class A187541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187541() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 4, 1, 12, 16, 20, 3, 28});
  }
}
