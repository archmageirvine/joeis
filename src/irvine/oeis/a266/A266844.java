package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266844.
 * @author Sean A. Irvine
 */
public class A266844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266844() {
    super(new long[] {-100000, 10000, 10}, new long[] {1, 110, 10100});
  }
}
