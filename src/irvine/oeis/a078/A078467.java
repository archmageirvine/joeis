package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078467.
 * @author Sean A. Irvine
 */
public class A078467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078467() {
    super(new long[] {1, 0, 0, 1}, new long[] {0, 1, 2, 3});
  }
}
