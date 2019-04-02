package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266046 Real part of Q^n, where Q is the quaternion 2 + j + k.
 * @author Sean A. Irvine
 */
public class A266046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266046() {
    super(new long[] {-6, 4}, new long[] {1, 2});
  }
}
