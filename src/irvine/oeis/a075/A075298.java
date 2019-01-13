package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075298.
 * @author Sean A. Irvine
 */
public class A075298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075298() {
    super(new long[] {1, -1, -1}, new long[] {1, 1, -5});
  }
}
