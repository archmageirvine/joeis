package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075112.
 * @author Sean A. Irvine
 */
public class A075112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075112() {
    super(new long[] {1, 1, 2, 2, 0, 1}, new long[] {4, 1, -1, 6, 16, 20});
  }
}
