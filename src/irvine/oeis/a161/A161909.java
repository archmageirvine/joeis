package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161909 Inverse binomial transform of A181586.
 * @author Sean A. Irvine
 */
public class A161909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161909() {
    super(new long[] {4, 2, -2, -3}, new long[] {0, 0, 1, -3});
  }
}
