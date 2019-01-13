package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042527.
 * @author Sean A. Irvine
 */
public class A042527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042527() {
    super(new long[] {-1, 0, 394, 0}, new long[] {1, 7, 393, 2758});
  }
}
