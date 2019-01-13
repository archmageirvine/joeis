package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042763.
 * @author Sean A. Irvine
 */
public class A042763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042763() {
    super(new long[] {-1, 0, 302, 0}, new long[] {1, 5, 301, 1510});
  }
}
