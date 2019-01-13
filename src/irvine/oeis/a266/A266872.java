package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266872.
 * @author Sean A. Irvine
 */
public class A266872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266872() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 10, 10101, 101010});
  }
}
