package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078051.
 * @author Sean A. Irvine
 */
public class A078051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078051() {
    super(new long[] {-1, -2, -1}, new long[] {1, -2, 0});
  }
}
