package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176027 Binomial transform of A005563.
 * @author Sean A. Irvine
 */
public class A176027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176027() {
    super(new long[] {8, -12, 6}, new long[] {0, 3, 14});
  }
}
