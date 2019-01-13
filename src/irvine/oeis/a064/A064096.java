package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064096.
 * @author Sean A. Irvine
 */
public class A064096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064096() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 67, 190});
  }
}
