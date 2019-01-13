package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264891.
 * @author Sean A. Irvine
 */
public class A264891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264891() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 112, 783, 2839});
  }
}
