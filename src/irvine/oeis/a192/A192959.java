package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192959.
 * @author Sean A. Irvine
 */
public class A192959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192959() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 0, 3, 10});
  }
}
