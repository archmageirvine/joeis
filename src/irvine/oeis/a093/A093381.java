package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093381.
 * @author Sean A. Irvine
 */
public class A093381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093381() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 8, 42, 186});
  }
}
