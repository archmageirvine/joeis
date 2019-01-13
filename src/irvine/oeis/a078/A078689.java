package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078689.
 * @author Sean A. Irvine
 */
public class A078689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078689() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 1, 1, 8, 1});
  }
}
