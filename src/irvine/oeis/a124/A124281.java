package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124281.
 * @author Sean A. Irvine
 */
public class A124281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124281() {
    super(new long[] {2, -2, 2, 1}, new long[] {1, 1, 3, 3});
  }
}
