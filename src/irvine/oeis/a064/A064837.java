package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064837.
 * @author Sean A. Irvine
 */
public class A064837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064837() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {0, 2, 18, 114, 420, 1170, 2710});
  }
}
