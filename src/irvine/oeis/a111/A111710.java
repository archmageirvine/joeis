package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111710.
 * @author Sean A. Irvine
 */
public class A111710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111710() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 7, 13, 18});
  }
}
