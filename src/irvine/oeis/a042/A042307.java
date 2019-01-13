package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042307.
 * @author Sean A. Irvine
 */
public class A042307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042307() {
    super(new long[] {-1, 0, 678, 0}, new long[] {1, 13, 677, 8814});
  }
}
