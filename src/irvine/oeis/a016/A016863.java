package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016863 a(n) = (5*n + 1)^3.
 * @author Sean A. Irvine
 */
public class A016863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016863() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 216, 1331, 4096});
  }
}
