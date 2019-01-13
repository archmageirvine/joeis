package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042387.
 * @author Sean A. Irvine
 */
public class A042387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042387() {
    super(new long[] {-1, 0, 0, 0, 322, 0, 0, 0}, new long[] {1, 1, 5, 6, 317, 323, 1609, 1932});
  }
}
