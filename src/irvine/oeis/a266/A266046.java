package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266046 Real part of <code>Q^n</code>, where Q is the quaternion <code>2 + j +</code> k.
 * @author Sean A. Irvine
 */
public class A266046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266046() {
    super(new long[] {-6, 4}, new long[] {1, 2});
  }
}
