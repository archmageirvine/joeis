package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078789.
 * @author Sean A. Irvine
 */
public class A078789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078789() {
    super(new long[] {4, -13, 7}, new long[] {1, 3, 10});
  }
}
