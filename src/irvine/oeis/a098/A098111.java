package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098111 Inverse binomial transform of A098149.
 * @author Sean A. Irvine
 */
public class A098111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098111() {
    super(new long[] {-5, 5}, new long[] {1, 0});
  }
}
