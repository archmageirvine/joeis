package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100059 First differences of A052911.
 * @author Sean A. Irvine
 */
public class A100059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100059() {
    super(new long[] {-2, 1, 3}, new long[] {1, 5, 14});
  }
}
