package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048755 Partial sums of <code>A048693</code>.
 * @author Sean A. Irvine
 */
public class A048755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048755() {
    super(new long[] {-1, -1, 3}, new long[] {1, 7, 20});
  }
}
