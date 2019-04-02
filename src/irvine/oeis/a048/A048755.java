package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048755 Partial sums of A048693.
 * @author Sean A. Irvine
 */
public class A048755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048755() {
    super(new long[] {-1, -1, 3}, new long[] {1, 7, 20});
  }
}
