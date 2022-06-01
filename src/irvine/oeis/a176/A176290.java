package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176290 Hankel transform of A105872.
 * @author Sean A. Irvine
 */
public class A176290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176290() {
    super(new long[] {-1, 10, -27, 10}, new long[] {1, 2, -3, -75});
  }
}
