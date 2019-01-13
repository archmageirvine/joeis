package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021674.
 * @author Sean A. Irvine
 */
public class A021674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021674() {
    super(new long[] {-288, 444, -179, 24}, new long[] {1, 24, 397, 5676});
  }
}
