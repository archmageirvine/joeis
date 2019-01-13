package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097112.
 * @author Sean A. Irvine
 */
public class A097112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097112() {
    super(new long[] {-90, 0, 19, 0}, new long[] {1, 4, 13, 40});
  }
}
