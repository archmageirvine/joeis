package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266069.
 * @author Sean A. Irvine
 */
public class A266069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266069() {
    super(new long[] {32, 0, -50, 0, 19, 0}, new long[] {1, 4, 2, 121, 4, 2035});
  }
}
