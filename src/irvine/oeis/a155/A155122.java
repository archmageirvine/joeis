package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155122.
 * @author Sean A. Irvine
 */
public class A155122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155122() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 16, 360, 1920, 6160});
  }
}
