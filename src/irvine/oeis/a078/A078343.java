package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078343.
 * @author Sean A. Irvine
 */
public class A078343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078343() {
    super(new long[] {1, 2}, new long[] {-1, 2});
  }
}
