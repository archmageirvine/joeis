package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134939.
 * @author Sean A. Irvine
 */
public class A134939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134939() {
    super(new long[] {-2025, 1440, -342, 32}, new long[] {0, 2, 64, 1274});
  }
}
