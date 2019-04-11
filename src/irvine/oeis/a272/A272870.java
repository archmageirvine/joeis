package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272870 Real part of <code>(n +</code> i)^4.
 * @author Sean A. Irvine
 */
public class A272870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272870() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, -4, -7, 28, 161});
  }
}
