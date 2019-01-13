package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064046.
 * @author Sean A. Irvine
 */
public class A064046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064046() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 70, 285});
  }
}
